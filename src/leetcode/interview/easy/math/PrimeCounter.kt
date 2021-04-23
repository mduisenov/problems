package leetcode.interview.easy.math

fun countPrimes(n: Int): Int {
    var count = 0
    for (i in 1 until n) {
        if (isPrime(i)) count++
    }
    return count
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    var i = 2
    while (i * i <= num) {
        if (num % i == 0)
            return false
        i++
    }
    return true
}

fun countPrimes2(n: Int): Int {
    val isPrimes = BooleanArray(n) { true }

    var i: Int = 2
    while (i * i < n) {
        if (!isPrimes[i]) {
            i++
            continue
        }
        var j: Int = i * i
        while (j < n) {
            isPrimes[j] = false
            j += i
        }
        i++

    }

    return if (n < 3) 0 else isPrimes.count { it } - 2
}

fun main() {
    print(countPrimes2(10))
}