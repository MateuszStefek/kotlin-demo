fun main() {
    listOf(1, 2, 3, 4, 5, 5, 7)
        .zipWithNext()
        .map { (a, b) -> a + b }
        .filter { it % 2 == 0 }
        .forEach { println(it) }
}

fun Sequence<String>.wrapped(): Sequence<String> = sequence {
    yield("START")
    yieldAll(this@wrapped)
    yield("STOP")
}

class WrappedSequenceExample {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            listOf("a", "b", "c")
                .asSequence()
                .wrapped()
                .take(3)
                .forEach { println(it) }
        }
    }
}

fun <T> Sequence<T>.switchOddEven(): Sequence<T> = sequence {
    with(iterator()) {
        while (hasNext()) {
            val even = next()
            if (hasNext()) {
                val odd = next()
                yield(odd)
            }
            yield(even)
        }
    }
}

class SwitchOddEvenExample {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            listOf(0, 1, 2, 3, 4, 5, 6)
                .asSequence()
                .switchOddEven()
                .forEach { println(it) }
        }
    }

}
