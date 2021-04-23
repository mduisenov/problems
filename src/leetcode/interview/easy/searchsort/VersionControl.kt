package leetcode.interview.easy.searchsort


fun firstBadVersion(n: Int): Int {
    var left = 1
    var right: Int = n
    while (left < right) {
        val middle = left + (right - left) / 2
        if (isBadVersion(middle)) {
            right = middle
        } else {
            left = middle + 1
        }
    }
    return left
}


private fun isBadVersion(version: Int): Boolean {
    return version >= 4
}

fun main() {
    val res = firstBadVersion(5)
    print(res)
}