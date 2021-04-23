package hackerrank.interview.greedy

import java.util.*
import kotlin.math.abs
import kotlin.math.min


fun minimumAbsoluteDifference(arr: Array<Int>): Int {
    var min = Int.MAX_VALUE

    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            val absDiff = abs(arr[i] - arr[j])
            min = kotlin.math.min(min, absDiff)
        }
    }

    return min
}

fun minimumAbsoluteDifference2(arr: Array<Int>): Int {
    Arrays.sort(arr)

    var diff = Int.MAX_VALUE

    for (i in 0 until arr.size - 1)
        diff = min(diff, arr[i + 1] - arr[i])

    return diff
}

fun main() {
    val res = minimumAbsoluteDifference2(arrayOf(1, -3, 71, 68, 17))
    print(res)
}