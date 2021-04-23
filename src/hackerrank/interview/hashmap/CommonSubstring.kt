package hackerrank.interview.hashmap

fun twoStrings(s1: String, s2: String): String {

    val map = s1.groupBy { it }
    for (ch in s2)
        if (map.containsKey(ch))
            return "YES"

    return "NO"
}

fun main() {
    val res = twoStrings("hi", "world")
    print(res)
}