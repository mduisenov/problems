package leetcode.arrays

fun validMountainArray(a: IntArray): Boolean {
    if (a.size < 3)
        return false

    var isPeakPassed = false
    for (i in 0..a.size - 2) {
        if (a[i] == a[i + 1])
            return false

        if (i == 0 && a[i] > a[i + 1])
            return false

        if (a[i] > a[i + 1])
            isPeakPassed = true

        if (isPeakPassed && a[i] < a[i + 1])
            return false

    }
    return isPeakPassed
}

fun main() {
    val res = validMountainArray(intArrayOf(2, 1))
    val res2 = validMountainArray(intArrayOf(3, 5, 5))
    val res3 = validMountainArray(intArrayOf(0, 3, 2, 1))
    val res4 = validMountainArray(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))
    val res5 = validMountainArray(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0))

    println(res)
    println(res2)
    println(res3)
    println(res4)
    println(res5)
}