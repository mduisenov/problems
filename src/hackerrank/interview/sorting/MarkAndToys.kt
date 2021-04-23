package hackerrank.interview.sorting

import java.util.*

fun maximumToys(prices: Array<Int>, k: Int): Int {
    Arrays.sort(prices)

    var count = 0
    var sum = 0

    for (p in prices) {
        if (sum + p <= k) {
            sum += p
            count++
        } else
            break
    }

    return count
}

fun main() {
    val res = maximumToys(arrayOf(1, 12, 5, 111, 200, 1000, 10), 50)
    print(res)
}