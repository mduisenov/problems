package leetcode.learn.arraystring

import java.lang.StringBuilder

fun reverseChars(chars: CharArray): Unit {
    var i = 0
    var j = chars.size - 1
    while (i < j) {
        val tmp = chars[i]
        chars[i] = chars[j]
        chars[j] = tmp
        i++
        j--
    }
}

fun reverseWords3(s: String): String {
    val words = s.replace("//s+".toRegex(), " ").split(" ")
    val result = StringBuilder()

    for (i in words.filterNot { it.isEmpty() }.indices)
        result.append(words[i].reversed()).append(" ")

    return result.toString().trim()
}

fun main() {
    val res = reverseWords3("Let's take LeetCode contest")
    print(res)
}