package hackerrank.interview.hashmap

import java.util.*


fun checkMagazine(magazine: Array<String>, note: Array<String>) {
    val magazineCounts: MutableMap<String, Int?> = HashMap()
    val noteCounts: MutableMap<String, Int?> = HashMap()

    for (word in magazine) {
        if (!magazineCounts.containsKey(word)) magazineCounts[word] = 0
        magazineCounts[word] = magazineCounts[word]!! + 1
    }

    for (word in note) {
        if (!noteCounts.containsKey(word)) noteCounts[word] = 0
        noteCounts[word] = noteCounts[word]!! + 1
    }

    for (n in note) {
        val mCounts = magazineCounts[n] ?: 0
        val nCounts = noteCounts[n] ?: 0

        if (mCounts < nCounts) {
            print("No")
            return
        }
    }

    print("Yes")
}

fun main() {
    val magazine = "give me one grand today night".split(" ").toTypedArray()
    val note = "give one grand today".split(" ").toTypedArray()
    checkMagazine(magazine, note)
}