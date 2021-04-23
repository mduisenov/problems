package leetcode.arrays

fun duplicateZeros(arr: IntArray): Unit {
    var i = 0
    while (i < arr.size) {
        if (arr[i] == 0) {
            shift(arr, i)
            i++
        }
        i++
    }
}

private fun shift(arr: IntArray, k: Int) {
    var i = arr.size - 2
    while (i >= k) {
        if (arr.size > i + 1)
            arr[i + 1] = arr[i]
        i--
    }
}

fun main() {
    duplicateZeros(intArrayOf(1, 0, 2, 3, 0, 4, 5, 0))
}