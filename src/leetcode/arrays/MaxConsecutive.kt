package leetcode.arrays

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    if (nums.firstOrNull { it == 1 } == null)
        return 0

    var max = Integer.MIN_VALUE

    var counter = 1
    var last = -1
    for (i in nums.indices) {
        if (last == nums[i] && last == 1)
            counter++
        else
            counter = 1
        max = maxOf(max, counter)
        last = nums[i]
    }

    return max
}

fun main() {
    val res = findMaxConsecutiveOnes(intArrayOf(0, 0))
    print(res)
}