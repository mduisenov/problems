package leetcode.arrays

import java.util.*

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var i = m
    var j = 0

    while (i < nums1.size) {
        nums1[i] = nums2[j]
        j++
        i++
    }
    Arrays.sort(nums1)

}

fun main() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2 = intArrayOf(2, 5, 6)
    merge(nums1, 3, nums2, 3)
}