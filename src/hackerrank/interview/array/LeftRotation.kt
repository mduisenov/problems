package hackerrank.interview.array

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    val res = a.copyOf()
    val shift = d % a.size

    for (item in a.withIndex()) {
        val i = (item.index + (a.size - shift)) % a.size
        res[i] = item.value
    }
    return res
}

fun main() {
    val res = rotLeft(arrayOf(33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97), 13)
    println("your: " + res.contentToString())
    println("expe: [87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60]")

}