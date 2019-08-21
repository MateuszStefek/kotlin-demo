package matste.kotlin.demo

import java.lang.IllegalArgumentException

@JvmOverloads
tailrec fun <T : Comparable<T>> binarySearch(
        a: Array<T>,
        fromIndex: Int = 0,
        toIndex: Int = a.size,
        key: T
): Int {
    if (toIndex < fromIndex) throw IllegalArgumentException("a < b")

    if (fromIndex == toIndex) return -1 - fromIndex

    val low = fromIndex
    val high: Int = toIndex - 1

    val mid = (low + high) / 2
    val midVal = a[mid]

    val comparison = key.compareTo(midVal)

    return when {
        comparison == 0 -> mid
        comparison < 0 -> binarySearch(a, fromIndex, mid, key)
        else -> binarySearch(a, mid + 1, toIndex, key)
    }
}

fun main(args: Array<String>) {
    val a = arrayOf("a", "c", "d")
    print(binarySearch(a = a, key = "c"))
}

/**
@JvmOverloads
tailrec fun <T : Comparable<T>> binarySearch(
a: Array<T>,
fromIndex: Int = 0,
toIndex: Int = a.size,
key: T
): Int {
if (toIndex < fromIndex) throw IllegalArgumentException("a < b")

if (fromIndex == toIndex) {
return -1 - fromIndex
}

val low = fromIndex
val high = toIndex - 1

val mid = (low + high) / 2
val midVal = a[mid]

val comparison = key.compareTo(midVal)
return when {
comparison == 0 -> mid
comparison > 0 -> binarySearch(a, mid + 1, toIndex, key)
else -> binarySearch(a, low, mid, key)
}
}

fun main() {
val a = arrayOf("ala", "kota", "ma")
print(binarySearch(a, 0, 3, "b"))
print(binarySearch(a = a, fromIndex = 0, key = "b"))
}
 **/