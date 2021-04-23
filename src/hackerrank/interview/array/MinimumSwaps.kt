package hackerrank.interview.array

fun minimumSwaps(arr: Array<Int>): Int {

    if (arr.size == 1) {
        return 0
    }

    var swapCount = 0
    var temp: Int

    var i = 1
    while (i <= arr.size) {

        if (i != arr[i - 1]) {

            temp = arr[i - 1]
            arr[i - 1] = arr[temp - 1]
            arr[temp - 1] = temp

            swapCount++
            i--
        }
        i++
    }

    return swapCount
}

fun main() {
    val res = minimumSwaps(arrayOf(1, 3, 5, 2, 4, 6, 7))
    print(res)
}