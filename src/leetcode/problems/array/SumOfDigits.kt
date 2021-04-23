package leetcode.problems.array

import java.util.*

fun sumOfDigits(nums: IntArray): Int {

    Arrays.sort(nums)
    var min = nums.min() ?: return -1
    var sum = 0
    while (min > 0) {
        sum += min.rem(10)
        min /= 10
    }
    return 1 - sum % 2
}

fun main() {
    val res = sumOfDigits(intArrayOf(34, 23, 1, 24, 75, 33, 54, 8))
    print(res)
}