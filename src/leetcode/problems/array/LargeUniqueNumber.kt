package leetcode.problems.array

fun largestUniqueNumber(nums: IntArray): Int {
    val map = HashMap<Int, Int>()
    nums.forEach {
        if (map[it] == null) {
            map[it] = it
        } else {
            map[it] = -1
        }
    }
    return map.values.max() ?: -1
}

fun main() {
    val res = largestUniqueNumber(intArrayOf(5, 7, 3, 9, 4, 9, 8, 3, 1))
    print(res)
}