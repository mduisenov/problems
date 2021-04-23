package problems.easy

import java.util.*
import kotlin.math.abs

fun pickingNumbers(a: Array<Int>): Int {
    var max = 0
    val matrix = a.groupByTo(TreeMap()) { it }.map { it.value }

    if (matrix.size == 1)
        return matrix[0].size

    for (i in 0 until matrix.size - 1) {
        val current = matrix[i]
        val next = matrix[i + 1]
        max = maxOf(max, maxOf(current.size, next.size))

        val absDiff = abs(current.first() - next.first())
        if (absDiff == 1)
            max = maxOf(max, current.size + next.size)

    }

    return max
}

fun main() {
    val str = "4 97 5 97 97 4 97 4 97 97 97 97 4 4 5 5 97 5 97 99 4 97 5 97 97 97 5 5 97 4 5 97 97 5 97 4 97 5 4 4 97 5 5 5 4 97 97 4 97 5 4 4 97 97 97 5 5 97 4 97 97 5 4 97 97 4 97 97 97 5 4 4 97 4 4 97 5 97 97 97 97 4 97 5 97 5 4 97 4 5 97 97 5 97 5 97 5 97 97 97"

    val res = pickingNumbers(arrayOf(4, 6, 5, 3, 3, 1))
    print(res)
}