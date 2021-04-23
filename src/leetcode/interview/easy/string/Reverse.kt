package leetcode.interview.easy.string

import java.lang.StringBuilder

fun reverseString(s: CharArray): Unit {
    s.reverse()
}

fun reverseString2(s: CharArray): Unit {
    var i = 0
    var j = s.size - 1
    while (i < j) {
        val start = s[i]
        val end = s[j]
        s[i] = end
        s[j] = start
        i++
        j--
    }
}

fun main() {
    val array = charArrayOf('h', 'e', 'l', 'l', 'o','o')
    reverseString2(array)
    print(array)
}