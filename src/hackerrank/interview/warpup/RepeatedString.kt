package hackerrank.interview.warpup

fun repeatedString(s: String, n: Long): Long {

    if (s.length >= n)
        return s.substring(0, n.toInt()).count { it == 'a' }.toLong()

    val times = n / s.length
    val modulo = n % s.length

    val tail = s.substring(0, modulo.toInt()).count { it == 'a'  }

    return s.count { it == 'a' } * times + tail

}

fun main() {
    val res = repeatedString("a", 1000000000000) //1000000000000
    print(res)
}