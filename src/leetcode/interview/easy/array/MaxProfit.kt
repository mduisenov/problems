package leetcode.interview.easy.array

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    for (i in 1 until prices.size)
        if (prices[i] > prices[i - 1])
            maxProfit += prices[i] - prices[i - 1]

    return maxProfit
}


fun main() {
    val res = maxProfit(intArrayOf(1, 2, 3, 4, 5))
    val res2 = maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
    println(res)
    println(res2)
}