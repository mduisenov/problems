package hackerrank.interview.string

import java.util.concurrent.CopyOnWriteArrayList

fun alternatingCharacters(s: String): Int {
    val list = CopyOnWriteArrayList(s.toList())

    var i = 0
    while (i < list.size) {
        if (i < list.size - 1 && list[i] == list[i + 1]) {
            list.removeAt(i + 1)
            i--
        }
        i++
    }

    return s.length - list.size
}

fun alternatingCharacters2(s: String): Int {
    var counter = 0

    for (i in s.indices)
        if (i < s.length - 1 && s[i] == s[i+1])
            counter++

    return counter
}

fun main() {
    print(alternatingCharacters2("ABBABBAA"))
}
