package leetcode.learn.binarysearch

import kotlin.math.ln
import kotlin.math.pow

fun mySqrt(x: Int): Int {
    if (x < 2)
        return x

    val left = Math.E.pow(0.5 * ln(x.toDouble())).toInt()
    val right = left + 1
    return if (right.toLong() * right > x) left else right
}

fun mySqrt2(x: Int): Int {
    if (x < 2) return x
    var num: Long
    var pivot: Int
    var left = 2
    var right = x / 2
    while (left <= right) {
        pivot = left + (right - left) / 2
        num = pivot.toLong() * pivot
        when {
            num > x -> right = pivot - 1
            num < x -> left = pivot + 1
            else -> return pivot
        }
    }
    return right
}

// bit shifts
fun mySqrt3(x: Int): Int {
    if (x < 2) return x
    val left: Int = mySqrt(x shr 2) shl 1
    val right = left + 1
    return if (right.toLong() * right > x) left else right
}

// Newton's method
fun mySqrt4(x: Int): Int {
    if (x < 2) return x
    var x0 = x.toDouble()
    var x1 = (x0 + x / x0) / 2.0
    while (Math.abs(x0 - x1) >= 1) {
        x0 = x1
        x1 = (x0 + x / x0) / 2.0
    }
    return x1.toInt()
}