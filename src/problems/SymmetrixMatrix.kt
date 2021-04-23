package problems

class SymmetrixMatrix

val row1: IntArray = intArrayOf(1, 2, 3, 4)
val row2: IntArray = intArrayOf(2, 3, 4, 5)
val row3: IntArray = intArrayOf(3, 4, 5, 6)
val row4: IntArray = intArrayOf(4, 5, 6, 7)

val matrix44: Array<IntArray> = arrayOf(row1, row2, row3, row4)

fun main() {
    check(matrix44)
}

fun check(arr: Array<IntArray>) {

    for (i in arr.indices) {
        var j = i
        while (j < arr[i].size) {
            if (j == arr[i].size - 1)
                print("\n")
            if (arr[i][j] != arr[j][i]) {
                print(false)
                return
            }
            j++
        }
    }
    println(true)

// complexity (n^2)
// space n(1)
}
