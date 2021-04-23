package leetcode.arrays

fun thirdMax(nums: IntArray): Int {
    val set = sortedSetOf<Int>()
    nums.forEach {
        set.add(it)
        if (set.size > 3) set.remove(set.first())
    }
    val max = if (set.size > 2) set.first() else set.last()
    return max
}

fun main() {
    val res = thirdMax(intArrayOf(2, 2, 3, 1))
    print(res)
}