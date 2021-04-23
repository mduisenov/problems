package leetcode.learn.arraystring.twodinemcianal

import java.util.*

fun findDiagonalOrder(matrix: Array<IntArray>): IntArray {
    if (matrix.isEmpty())
        return IntArray(0)

    val rows = matrix.size
    val columns: Int = matrix[0].size

    val result = IntArray(rows * columns)
    var k = 0
    val intermediate = ArrayList<Int>()

    for (d in 0 until rows + columns - 1) {
        var r = if (d < columns) 0 else d - columns + 1
        var c = if (d < columns) d else columns - 1

        while (r < rows && c > -1) {
            intermediate.add(matrix[r][c])
            ++r
            --c
        }
        if (d % 2 == 0)
            intermediate.reverse()

        for (i in intermediate.indices)
            result[k++] = intermediate[i]

        intermediate.clear()
    }
    return result
}


fun main() {
    val row1  = intArrayOf(1, 2, 3 )
    val row2  = intArrayOf(4, 5, 6  )
    val row3  = intArrayOf(7, 8, 9 )
//    val row1 = intArrayOf(1, 2)
//    val row2 = intArrayOf(4, 3)
    val matrix = arrayOf(row1, row2, row3)
    val res = findDiagonalOrder(matrix)
    println(res.contentToString())
}