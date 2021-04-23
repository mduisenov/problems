package hackerrank.interview.warpup

fun jumpingOnClouds(array: Array<Int>): Int {
    var min = 0

    var i = 0
    while (i < array.size - 1) {
        val step = i + 1
        val doubleStep = i + 2

        if (doubleStep < array.size && array[doubleStep] == 0) {
            i += 2
            min++
        } else if (step < array.size && array[step] == 0) {
            i++
            min++
        } else {
            return -1
        }
    }

    return min
}

fun main() {
    val res = jumpingOnClouds(arrayOf(0, 0, 1, 0, 0, 1, 0))
    print(res)
}