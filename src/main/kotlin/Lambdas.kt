package matste.kotlin.demo

import mu.KotlinLogging
import java.util.Arrays
import kotlin.Int as Int1

val log = KotlinLogging.logger("AAA")

fun main() {
    val a = arrayOf("a", "b", "d")

    // Lambdas-like in java
    Arrays.binarySearch(a, "C", { x, y -> x.compareTo(y, ignoreCase = true) })
    // Parantheses
    Arrays.binarySearch(a, "C") { x, y -> x.compareTo(y, ignoreCase = true) }

    // With no other arguments, () can be skipped entirely
    log.debug { "Hello " + "world" }


    fun myMax(a: Array<String>, comparator: Comparator<String>): String {
        TODO()
    }
    // Does not compile, WTF?
    // myMax(arrayOf("a", "b", "c"), { x, y -> x.compareTo(y, ignoreCase = true) })

    // The type must be explicitly provided like this:
    myMax(arrayOf("a", "b", "c"), Comparator { x, y -> x.compareTo(y, ignoreCase = true) })

    // Don't use FunctionalInterfaces, use proper function types

    fun myMax2(a: Array<String>, comparator: (String, String) -> Int1) {
        TODO()
    }

    // Proper function types
    myMax2(arrayOf("a", "b", "c")) { x, y -> x.compareTo(y, ignoreCase = true) }
}
