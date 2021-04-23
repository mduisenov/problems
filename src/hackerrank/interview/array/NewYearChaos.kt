package hackerrank.interview.array

fun <T> Array<T>.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}

fun minimumBribes(q: Array<Int>) {

    var counter = 0
    for (i in q.size - 1 downTo 0) {
        // An integer cannot move more than two places
        // So if an integer minus its position in the array is 3 or greater
        // We know it bribed more than two people
        if (q.get(i) - (i + 1) >= 3) {
            println("Too chaotic")
            return
        }

        // From one index before the ORIGINAL index of the current integer,
        // all the way to where it currently is, check if any integers are greater
        for (j in Math.max(0, q.get(i) - 2) until i)
            if (q.get(j) > q.get(i))
                counter++
    }

    println(counter)
}

fun main() {
    minimumBribes(arrayOf(2, 1, 5, 3, 4))
    minimumBribes(arrayOf(2, 5, 1, 3, 4))
}