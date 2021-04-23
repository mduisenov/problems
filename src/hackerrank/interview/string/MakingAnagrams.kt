package hackerrank.interview.string

import kotlin.math.abs

fun makeAnagram(first: String, second: String): Int {
    val freqFirst = IntArray(26)
    val freqSecond = IntArray(26)

    for (ch in first)
        freqFirst[ch - 'a']++

    for (ch in second)
        freqSecond[ch - 'a']++

    var counter = 0

    for (i in 0..25)
        counter += abs(freqFirst[i] - freqSecond[i])

    return counter
}

fun main() {
    print(makeAnagram("fcrxzwscanmligyxyvym",
            "jxwtrhvujlmrpdoqbisbwhmgpmeoke"))
}