package leetcode

import java.util.*


fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        val start = i + 1
        for (j in start until nums.size) {
            if (nums[i] + nums[j] == target)
                return intArrayOf(i, j)
        }
    }
    return intArrayOf()
}

fun twoSum2(nums: IntArray, target: Int): IntArray? {
    val map: MutableMap<Int, Int> = HashMap()
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        }
        map[nums[i]] = i
    }
    throw IllegalArgumentException("No two sum solution")
}

fun main() {
    val res = twoSum(intArrayOf(3, 2, 4), 6)
    print(res.contentToString())
}