package leetcode.arrays

fun sortArrayByParity(nums: IntArray): IntArray {
    var index = 0
    for (i in nums.indices) {
        if (nums[i] % 2 == 0) {
            val temp = nums[index]
            nums[index++] = nums[i]
            nums[i] = temp
        }
    }

    return nums
}

fun main() {
    val res = sortArrayByParity(intArrayOf(3, 2, 4, 1))
    print(res.contentToString())
}