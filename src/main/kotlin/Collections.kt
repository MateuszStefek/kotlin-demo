package matste.kotlin.demo

fun main() {
    val mutableList: MutableList<String> = mutableListOf("a")
    val readonlyList: List<String> = mutableList
    // Does not compile
    // readonlyList.add("x")

    println(readonlyList)
    mutableList.add("b")
    println(readonlyList)


    // However, list literals are actually immutable
    val example2: MutableList<Int> = listOf(1, 2, 3) as MutableList<Int>
//    example2.map { it + 1 }
}
