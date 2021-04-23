package leetcode.learn.arraystring

import java.math.BigInteger




fun addBinary(a: String, b: String): String {
    return Integer.toBinaryString(a.toInt(2) + b.toInt(2))
}

fun addBinary2(a: String, b: String): String? {
    val n = a.length
    val m = b.length
    if (n < m)
        return addBinary2(b, a)

    val L = maxOf(n, m)
    val sb = StringBuilder()
    var carry = 0
    var j = m - 1
    for (i in L - 1 downTo -1 + 1) {
        if (a[i] == '1') ++carry
        if (j > -1 && b[j--] == '1') ++carry
        if (carry % 2 == 1) sb.append('1')
        else
            sb.append('0')
        carry /= 2
    }
    if (carry == 1) sb.append('1')
        sb.reverse()

    return sb.toString()
}

// Bit manipulation
fun addBinary3(a: String?, b: String?): String? {
    var x = BigInteger(a, 2)
    var y = BigInteger(b, 2)
    val zero = BigInteger("0", 2)
    var carry: BigInteger
    var answer: BigInteger
    while (y.compareTo(zero) != 0) {
        answer = x.xor(y)
        carry = x.and(y).shiftLeft(1)
        x = answer
        y = carry
    }
    return x.toString(2)
}
fun main() {
    addBinary("11", "1")
}