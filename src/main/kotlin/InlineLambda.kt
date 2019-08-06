package matste.kotlin.demo

fun strangeSum(l: List<Int>): Int {
    return l.sumBy {
        if (it < 0) {
            return 0
        } else {
            it
        }
    }
}

fun main() {
    // This prints "4"
    println(listOf(1, 0, 3).sumBy { it })

    // What will be printed here?
    println(strangeSum(listOf(1, -1, 3)))
}
