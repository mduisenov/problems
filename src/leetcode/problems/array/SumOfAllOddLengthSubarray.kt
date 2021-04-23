package leetcode.problems.array

fun highFive(items: Array<IntArray>): Array<IntArray> {
    return items.groupBy({ it.first() }, { it[1] }).toSortedMap()
            .map {
                val student = it.key
                val average = it.value.sortedDescending().take(5).average().toInt()
                intArrayOf(student, average)
            }.toTypedArray()
}

fun main() {
    val res = highFive(arrayOf(
            intArrayOf(1, 91),
            intArrayOf(1, 92),
            intArrayOf(1, 100),
            intArrayOf(1, 60),
            intArrayOf(1, 65),
            intArrayOf(1, 87)
    ))
    print(res.first()[1])
}