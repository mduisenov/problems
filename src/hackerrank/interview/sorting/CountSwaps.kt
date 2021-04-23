package hackerrank.interview.sorting

private fun swap(a: Array<Int>, i: Int, j: Int) {
    val temp = a[i]
    a[i] = a[j]
    a[j] = temp
}

fun countSwaps(a: Array<Int>) {
    var count = 0
    for (i in a.indices) {
        for (j in 0 until a.size - 1) {
            // Swap adjacent elements if they are in decreasing order
            if (a[j] > a[j + 1]) {
                swap(a, j, j + 1)
                count++
            }
        }
    }
    println("Array is sorted in $count swaps.")
    println("First Element: ${a[0]}")
    println("Last Element: ${a[a.size - 1]}")
}

fun main() {
    countSwaps(arrayOf(6, 4, 1))
}