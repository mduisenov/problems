package leetcode.interview.easy.string

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length)
        return false

    val table = IntArray(26)
    for (c in s) {
        table[c - 'a']++
    }

    for (c in t) {
        table[c - 'a']--

        if (table[c - 'a'] < 0)
            return false
    }
    return true
}

fun main() {
    print(isAnagram("a", "b"))
}