package leetcode.interview.easy.math

import kotlin.math.log10

fun isPowerOfThree2(n: Int): Boolean {
    var n = n
    if (n < 1)
        return false

    while (n % 3 == 0)
        n /= 3

    return n == 1
}

fun isPowerOfThree(n: Int): Boolean {
    return log10(n.toDouble()) / log10(3.0) % 1 == 0.0
}

fun isPowerOfThree3(n: Int): Boolean {
    return n.toString(3).matches("^10*$".toRegex())
}

fun main() {
    print(isPowerOfThree(13))
}