package leetcode.interview.easy.math

fun romanToInt(s: String): Int {
    var total = 0
    var i = 0

    while (i < s.length)
        if (i < s.length - 1 && s[i].intValue() < s[i + 1].intValue()) {
            total = total + s[i + 1].intValue() - s[i].intValue()
            i += 2
        } else {
            total += s[i].intValue()
            i++
        }

    return total
}

fun Char.intValue(): Int {
    return when(this) {
        'M' -> 1000
        'D' -> 500
        'C' -> 100
        'L' -> 50
        'X' -> 10
        'V' -> 5
        else -> 1
    }
}