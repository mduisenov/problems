package leetcode.learn.binarysearch

fun findPeakElement(nums: IntArray): Int {
    for (i in 0 until nums.size - 1) {
        if (nums[i] > nums[i + 1]) return i
    }
    return nums.size - 1
}

fun findPeakElement2(nums: IntArray): Int {
    return search(nums, 0, nums.size - 1)
}

fun search(nums: IntArray, left: Int, right: Int): Int {
    if (left == right)
        return left

    val mid = (left + right) / 2

    return if (nums[mid] > nums[mid + 1])
        search(nums, left, mid)
    else
        search(nums, mid + 1, right)
}

fun findPeakElement3(nums: IntArray): Int {
    var left = 0
    var right = nums.size - 1

    while (left < right) {
        val mid = (left + right) / 2
        if (nums[mid] > nums[mid + 1])
            right = mid
        else
            left = mid + 1
    }
    return left
}