package leetcode.arrays

fun findNumbers(nums: IntArray): Int {
    var counter = 0

    nums.forEach {
        if (it.toString().length % 2 == 0)
            counter++
    }

    return counter
}

fun main() {
    val res = findNumbers(intArrayOf(12,345,2,6,7896))
    print(res)
}