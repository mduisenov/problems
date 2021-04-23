package leetcode.arrays

import kotlin.math.abs

fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val missingNumbers = mutableListOf<Int>()

    for (element in nums) {
        val index = abs(element) - 1
        if (nums[index] > 0) {
            nums[index] = -nums[index]
        }
    }
    for (i in nums.indices) {
        if (nums[i] > 0) {
            missingNumbers.add(i + 1)
        }
    }
    return missingNumbers
}

fun main() {
    val res = findDisappearedNumbers(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1))
    val res2 = findDisappearedNumbers(intArrayOf(1, 1))
    print(res2)
}