import java.io.File

fun main(args: Array<String>) {
    var input = getInput("input.txt")
    println(version1(input))
    println(version1(input))


}

fun version1(input: MutableList<Int>): Int {
    var seen = mutableListOf<List<Int>>()
    var count = 0

    while (input !in seen) {
        seen.add(input.toList())
        val max = input.withIndex().maxBy { it.value }!!
        input[max.index] = 0
        ((max.index + 1)..(max.index + max.value)).forEach{input[it % input.size]++}
        count++
    }
    return count
}


fun getInput(input: String): MutableList<Int> {
    return File(input).readText().split("\t").map{it.toInt()}.toMutableList()
}