package leetcode.interview.easy.array

import kotlin.collections.HashMap


fun isValidSudoku(board: Array<CharArray>): Boolean {
    // init data
    val rows: Array<HashMap<Int, Int>> = Array(9) { hashMapOf<Int, Int>() }
    val columns: Array<HashMap<Int, Int>> = Array(9) { hashMapOf<Int, Int>() }
    val boxes: Array<HashMap<Int, Int>> = Array(9) { hashMapOf<Int, Int>() }

    // validate a board
    for (i in board.indices) {
        for (j in board[i].indices) {
            val num = board[i][j]
            if (num != '.') {
                val n = num.toInt()
                val boxIndex = i / 3 * 3 + j / 3

                // keep the current cell value
                rows[i][n] = rows[i].getOrDefault(n, 0) + 1
                columns[j][n] = columns[j].getOrDefault(n, 0) + 1
                boxes[boxIndex][n] = boxes[boxIndex].getOrDefault(n, 0) + 1

                // check if this value has been already seen before
                if (rows[i][n]!! > 1 || columns[j][n]!! > 1 || boxes[boxIndex][n]!! > 1) return false
            }
        }
    }
    return true
}