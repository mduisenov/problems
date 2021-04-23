package leetcode.interview.easy.string

fun firstUniqChar(s: String): Int {
    val charCount = IntArray(26)
    for (c in s)
        charCount[c - 'a'] = charCount[c - 'a'] + 1

    for (i in s.indices) {
        val c = s[i]
        if (charCount[c - 'a'] == 1)
            return i
    }

    return -1
}

fun main() {
    val res = firstUniqChar("loveleetcode")
    print(res)
}
