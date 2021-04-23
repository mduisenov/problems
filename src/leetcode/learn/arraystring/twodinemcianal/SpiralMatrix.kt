package leetcode.learn.arraystring.twodinemcianal

import java.util.*


fun spiralOrder2(matrix: Array<IntArray>): List<Int> {
    val ans: MutableList<Int> = ArrayList<Int>()
    if (matrix.isEmpty())
        return ans

    val R = matrix.size
    val C: Int = matrix[0].size
    val seen = Array(R) { BooleanArray(C) }
    val dr = intArrayOf(0, 1, 0, -1)
    val dc = intArrayOf(1, 0, -1, 0)
    var r = 0
    var c = 0
    var di = 0
    for (i in 0 until R * C) {
        ans.add(matrix[r][c])
        seen[r][c] = true
        val cr = r + dr[di]
        val cc = c + dc[di]
        if (cr in 0 until R && 0 <= cc && cc < C && !seen[cr][cc]) {
            r = cr
            c = cc
        } else {
            di = (di + 1) % 4
            r += dr[di]
            c += dc[di]
        }
    }
    return ans
}

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val ans: MutableList<Int> = ArrayList<Int>()
    if (matrix.isEmpty())
        return ans

    var r1 = 0
    var r2 = matrix.size - 1
    var c1 = 0
    var c2: Int = matrix[0].size - 1
    while (r1 <= r2 && c1 <= c2) {
        for (c in c1..c2)
            ans.add(matrix[r1][c])
        for (r in r1 + 1..r2)
            ans.add(matrix[r][c2])

        if (r1 < r2 && c1 < c2) {
            for (c in c2 - 1 downTo c1 + 1)
                ans.add(matrix[r2][c])

            for (r in r2 downTo r1 + 1)
                ans.add(matrix[r][c1])
        }
        r1++
        r2--
        c1++
        c2--
    }
    return ans
}