package problems.easy

fun viralAdvertising(n: Int): Int {
    var shared = 5
    var liked = 0
    var cum = 0
    for (i in 1..n) {
        if (i > 1) {
            shared = liked * 3
        }
        liked = shared / 2
        cum += liked
    }
    return cum
}

fun main() {
    print(viralAdvertising(3))
}