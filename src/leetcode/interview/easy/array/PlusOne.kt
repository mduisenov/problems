package leetcode.interview.easy.array

fun plusOne(digits: IntArray): IntArray {
    val n = digits.size

    for (i in n - 1 downTo 0) {
        if (digits[i] == 9)
            digits[i] = 0
         else {
            digits[i]++
            return digits
        }
    }

    // we're here because all the digits are nines
    val answer = IntArray(n + 1)
    answer[0] = 1
    return answer
}