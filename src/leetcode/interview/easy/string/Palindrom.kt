package leetcode.interview.easy.string

fun isPalindrome(s: String): Boolean {
    var i = 0
    var j = s.length - 1
    while (i < j) {
        while (i < j && !s[i].isLetterOrDigit()) i++
        while (i < j && !s[j].isLetterOrDigit()) j--
        if (s[i++].toLowerCase() != s[j--].toLowerCase()) return false
    }
    return true
}

fun isPalindrome2(s: String): Boolean {
    val letters = s.toLowerCase().filter { it.isLetter() || it.isDigit() }
    var left = 0;
    var right = letters.length - 1
    while (left < right)
        if (letters[left++] != letters[right--])
            return false

    return true
}

fun main() {
    val res = isPalindrome2("A man, a plan, a canal: Panama")
    print(res)
}