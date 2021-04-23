package leetcode.interview.easy.array

fun singleNumber(nums: IntArray): Int {
    val size = nums.size

    if (size == 1)
        return nums[0]

    nums.sort()

    var counter = 1
    for (i in 1 until size) {
        val item = nums[i]
        val prev = nums[i-1]

        if (i == size - 1 && item != prev)
            return nums[i]
        if (counter < 2 && item != prev)
            return prev
        else if (item == prev)
            counter++
        else
            counter = 1
    }

    return -1
}

// bitwise
fun singleNumber2(nums: IntArray): Int {
    var a = 0
    for (i in nums) {
        a = a xor i
    }
    return a
}
fun main() {
    val res = singleNumber(intArrayOf(-336, 513, -560, -481, -174, 101, -997, 40, -527, -784, -283, -336, 513, -560, -481, -174, 101, -997, 40, -527, -784, -283, 354))
    val res2 = singleNumber(intArrayOf(2, 2, 1))
    val res3 = singleNumber(intArrayOf(4, 1, 2, 1, 2))
    val res4 = singleNumber(intArrayOf(1))
    println(res)
    println(res3)
    println(res4)
    print(res2)
}