package leetcode.learn.arraystring

fun dominantIndex2(nums: IntArray): Int {
    var maxIndex = 0
    for (i in nums.indices) {
        if (nums[i] > nums[maxIndex])
            maxIndex = i
    }
    for (i in nums.indices) {
        if (maxIndex != i && nums[maxIndex] < 2 * nums[i])
            return -1
    }
    return maxIndex
}

fun dominantIndex(nums: IntArray): Int {
    if (nums.size == 1)
        return 0

    val max = nums.max() ?: 0
    val maxSecond = nums.filter { it != max }.max() ?: 0

    return if (max >= maxSecond * 2)
        nums.indexOf(max)
    else
        -1
}

fun main() {
    val res = dominantIndex(intArrayOf(0, 0, 2, 3))
    print(res)
}