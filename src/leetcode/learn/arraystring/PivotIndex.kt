package leetcode.learn.arraystring

fun pivotIndex(nums: IntArray): Int {
    val sum = nums.sum()
    var leftsum = 0
    for (i in nums.indices) {
        if (leftsum == sum - leftsum - nums[i])
            return i
        leftsum += nums[i]
    }

    return -1
}