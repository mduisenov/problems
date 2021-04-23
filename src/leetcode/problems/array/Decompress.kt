package leetcode.problems.array

fun decompressRLElist(nums: IntArray): IntArray {
    val answer = mutableListOf<Int>()
    for (i in nums.indices) {
        if (i % 2 == 0)
            for (j in 0 until nums[i])
                answer.add(nums[i + 1])

    }
    return answer.toIntArray()
}

fun main() {
    val res = decompressRLElist(intArrayOf(1, 2, 3, 4))
    print(res.contentToString())
}