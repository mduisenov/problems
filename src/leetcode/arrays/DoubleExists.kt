package leetcode.arrays

fun checkIfExist(arr: IntArray): Boolean {
    val map = arr.groupBy { it }

    for (a in arr) {
        if (a == 0 && map[a]!!.size <= 1)
            continue

        if (map.contains(a * 2))
            return true
    }
    return false
}

fun main() {
    val res = checkIfExist(intArrayOf(10, 2, 5, 3))
    val res2 = checkIfExist(intArrayOf(-2, 0, 10, -19, 4, 6, -8))
    val res3 = checkIfExist(intArrayOf(0, 0))

    println(res)
    println(res2)
    print(res3)
}