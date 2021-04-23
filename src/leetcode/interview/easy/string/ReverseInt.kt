package leetcode.interview.easy.string

import kotlin.math.abs

fun reverse(x: Int): Int {
    val reversed = StringBuilder().append(abs(x)).reverse().toString()
    val res = reversed.toIntOrNull() ?: 0
    return if (x < 0) res * -1 else res
}

fun main() {
    print(reverse(-123))
}