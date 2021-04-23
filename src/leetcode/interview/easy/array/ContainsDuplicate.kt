package leetcode.interview.easy.array

fun containsDuplicate(nums: IntArray): Boolean {
    nums.sort()
    for (i in 1 until nums.size) {
        if (nums[i] == nums[i-1])
            return true
    }
    return false
}