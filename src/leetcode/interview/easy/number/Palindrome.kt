package leetcode.interview.easy.number

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false

    var num = x; var reversed = 0

    while(num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }
    return reversed == x
}

fun main() {
    print(isPalindrome(121))
}