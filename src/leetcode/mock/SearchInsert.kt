package leetcode.mock

import kotlin.math.max

fun searchInsert(nums: IntArray, target: Int): Int {
    if (target == 0)
        return 0

    if (target > nums.last())
        return nums.size

    for (i in nums.indices) {
        if (target <= nums[i])
            return maxOf(i, 0)
    }

    return 0
}

fun main() {
    val res = searchInsert(intArrayOf(1, 3, 5, 6), 5)
    print(res)
}