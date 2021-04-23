package leetcode.arrays

fun removeDuplicates(nums: IntArray): Int {
    var i = 0
    while (i < nums.size - 1) {
        if (nums[i] == nums[i + 1] && nums[i] != Int.MIN_VALUE)
            shift(i, nums)
        else
            i++
    }
    return nums.filter { it != Int.MIN_VALUE }.size
}

private fun shift(i: Int, nums: IntArray) {
    var j = i
    while (j < nums.size - 1) {
        nums[j] = nums[j + 1]
        j++
    }
    nums[j] = Int.MIN_VALUE
}

fun removeDuplicates2(nums: IntArray): Int {

    if (nums.isEmpty()) return 0

    var i = 0

    for (j in 1 until nums.size) {
        if (nums[j] != nums[i])
            nums[++i] = nums[j]

    }

    return ++i
}

fun removeDuplicates3(nums: IntArray): Int {
    var answer = 1

    for (i in 1 until nums.size)
        if (nums[i] == nums[i - 1])
            continue
        else {
            nums[answer] = nums[i]
            answer += 1
        }

    return answer
}


fun removeDuplicates4(nums: IntArray): Int {

    var slow = 0
    var fast = 0

    while (fast < nums.size) {
        if (nums[slow] != nums[fast]) {
            nums[slow + 1] = nums[fast]
            slow++
        }
        fast++
    }

    return slow + 1
}

fun main() {
    val res = removeDuplicates2(intArrayOf(1, 1, 2))
    val res2 = removeDuplicates2(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))
//    val res3 = removeDuplicates2(intArrayOf(0, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    println(res)
    println(res2)
//    print(res3)
}