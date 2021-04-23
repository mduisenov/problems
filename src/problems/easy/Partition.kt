package problems.easy

import java.util.*

fun mostBalancedPartition(parent: Array<Int>, filesSize: Array<Int>): Int {

    val n = filesSize.size
    var minAbsDiff = 0
    for (i in 0 until n) minAbsDiff += filesSize[i]
    val f = BooleanArray(minAbsDiff / 2 + 1)
    Arrays.fill(f, false)
    f[0] = true
    for (i in 0 until n)
        for (j in minAbsDiff / 2 downTo filesSize[i]) f[j] = f[j] || f[j - filesSize[i]]

    for (i in minAbsDiff / 2 downTo 0)
        if (f[i])
            return minAbsDiff - i - i

    return minAbsDiff
}

fun main() {
    val res = mostBalancedPartition(arrayOf(-1, 0, 1, 2 ), arrayOf(1, 4, 3, 4))
    print(res)
}