package leetcode.interview.easy.array


fun intersect2(nums1: IntArray, nums2: IntArray): IntArray {
    return nums1.toSet().intersect(nums2.toSet()).toIntArray()
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    nums1.sort()
    nums2.sort()
    var i = 0
    var j = 0
    var k = 0
    while (i < nums1.size && j < nums2.size) {
        when {
            nums1[i] < nums2[j] -> i++
            nums1[i] > nums2[j] -> j++
            else -> {
                nums1[k++] = nums1[i++]
                j++
            }
        }
    }
    return nums1.copyOfRange(0, k)
}

fun intersect3(nums1: IntArray, nums2: IntArray): IntArray {
    val m1 = nums1.toList().groupingBy { it }.eachCount()
    val m2 = nums2.toList().groupingBy { it }.eachCount()
    return m1
            .entries
            .flatMap { (k1, v1) ->
                val v2 = m2[k1] ?: 0
                List(minOf(v1, v2)) { k1 }
            }
            .toIntArray()
}

fun main() {
    val res = intersect3(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2))
    val res2 = intersect3(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4))
    println(res.contentToString())
    println(res2.contentToString())
}