package leetcode.interview.easy.array

fun rotate(matrix: Array<IntArray>): Unit {
    val size = matrix.size
    val result = Array(size) { intArrayOf() }
    for (i in size - 1 downTo 0) {
        val array = IntArray(size)
        for (j in matrix[i].indices)
            array[j] = matrix[i][j]
        result[i] = array
    }

    result.forEach {
        print(it.contentToString())
    }

}

fun main() {
    val array = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
    rotate(array)

}