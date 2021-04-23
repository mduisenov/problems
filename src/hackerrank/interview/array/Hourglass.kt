package hackerrank.interview.array

import kotlin.math.max


fun hourglassSum(arr: Array<Array<Int>>): Int {
    var res = Int.MIN_VALUE

    for (i in arr.indices) {
        if (i > arr.size - 3)
            break

        for (j in arr[i].indices) {
            val rightBound = arr[i].size - 3
            if (j > rightBound) continue

            val sum = arr[i][j] +     arr[i][j + 1] +     arr[i][j + 2] +
                                           arr[i + 1][j + 1] +
                           arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]

            res = max(sum, res)

        }
    }

    return res
}

fun main() {
    val array1 = arrayOf(-1, -1, 0, -9, -2, -2)
    val array2 = arrayOf(-2, -1, -6, -8, -2, -5)
    val array3 = arrayOf(-1, -1, -1, -2, -3, -4)
    val array4 = arrayOf(-1, -9, -2, -4, -4, -5)
    val array5 = arrayOf(-7, -3, -3, -2, -9, -9)
    val array6 = arrayOf(-1, -3, -1, -2, -4, -5)

    val res = hourglassSum(arrayOf(array1, array2, array3, array4, array5, array6))
    print(res)
}