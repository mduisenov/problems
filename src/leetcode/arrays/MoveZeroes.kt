package leetcode.arrays

fun moveZeroes(nums: IntArray): Unit {
    var index = 0
    for (i in nums.indices) {
        if (nums[i] != 0)
            nums[index++] = nums[i]
    }

    for (i in index until nums.size) {
        nums[i] = 0
    }
}

fun main() {
    val array = intArrayOf(0, 1, 0, 3, 12)
    moveZeroes(array)
    print(array.contentToString())
}