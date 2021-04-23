package leetcode.arrays

fun heightChecker(heights: IntArray): Int {
    val sorted = heights.sortedArray()
    var count = 0

    for (i in heights.indices) {
        if (heights[i] != sorted[i]) {
            count++
        }
    }
    return count
}

fun main() {
    val res = heightChecker(intArrayOf(1, 2, 3, 4, 5))
    print(res)
}

