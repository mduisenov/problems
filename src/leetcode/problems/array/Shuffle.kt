package leetcode.problems.array

fun shuffle(nums: IntArray, n: Int): IntArray {
    val answer = IntArray(nums.size)
    var index = 0
    for (i in 0 until n) {
        answer[index] = nums[i]
        answer[index + 1] = nums[n + i]
        index += 2
    }
    return answer
}

fun main() {
    val res = shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3)
    print(res.contentToString())
}