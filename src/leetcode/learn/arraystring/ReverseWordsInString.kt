package leetcode.learn.arraystring

fun reverseWords2(s: String): String? {
    // remove leading spaces
    var s = s
    s = s.trim { it <= ' ' }
    // split by multiple spaces
    val wordList = mutableListOf(*s.split("\\s+").toTypedArray())
    wordList.reverse()
    return java.lang.String.join(" ", wordList)
}

fun reverseWords(s: String): String {
    val words = s.trim { it <= ' ' }.split(" ").toTypedArray()
    val result = StringBuilder()
    for (i in words.indices.reversed())
        if (words[i].isNotEmpty())
            result.append(words[i])
                    .append(" ")

    return result.toString().trim { it <= ' ' }
}

fun main() {
    val res = reverseWords("  hello world  ")
    print(res)
}