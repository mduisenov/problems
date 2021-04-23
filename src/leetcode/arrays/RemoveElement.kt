package leetcode.arrays

private const val UNDEFINED = Integer.MIN_VALUE

fun removeElement(nums: IntArray, value: Int): Int {
    var i = 0
    while (i < nums.size) {
        if (nums[i] == value)
            shift(nums, i)
        else
            i++
    }

    return nums.filter { it != UNDEFINED }.size
}

private fun shift(nums: IntArray, i: Int) {
    var j = i + 1
    while (j < nums.size) {
        nums[j - 1] = nums[j]
        j++
    }
    nums[j - 1] = UNDEFINED
}

fun main() {
    val res = removeElement(intArrayOf(3, 2, 2, 3), 3)
    val res2 = removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2)
    println(res)
    print(res2)
}