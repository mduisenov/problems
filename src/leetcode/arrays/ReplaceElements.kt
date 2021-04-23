package leetcode.arrays

fun replaceElements(arr: IntArray): IntArray {
    var max = arr.last()
    arr[arr.size - 1] = -1

    for (i in arr.size - 2 downTo 0) {
        val nextMax = maxOf(max, arr[i])
        arr[i] = max
        max = nextMax

    }
    return arr
}

fun main() {
    val res = replaceElements(intArrayOf(17, 18, 5, 4, 6, 1))
    print(res.contentToString())
}