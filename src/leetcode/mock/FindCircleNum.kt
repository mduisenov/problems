package leetcode.mock

fun findCircleNum(matrix: Array<IntArray>): Int {
    var friendCount = 0
    // a boolean array for visited
    val row = matrix.size
    val visited = BooleanArray(row)
    for (i in 0 until row) {
        if (!visited[i]) {
            // do the dfs and increase the count
            dfs(matrix, visited, i)
            friendCount += 1
        }
    }
    return friendCount
}

fun dfs(matrix: Array<IntArray>, visited: BooleanArray, current: Int) {
    if (visited[current])
        return

    visited[current] = true
    for (i in 0 until matrix[current].size) {
        if (!visited[i] && matrix[current][i] == 1) // continue the dfs
            dfs(matrix, visited, i)
    }
}

fun main() {
    val array = arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 1, 1), intArrayOf(0, 1, 1))
    val res = findCircleNum(array)
    print(res)
}