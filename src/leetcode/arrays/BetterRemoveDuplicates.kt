package leetcode.arrays

fun betterRemoveDuplicates(array: IntArray): Int {
    var writePointer = 1
    for (readPointer in 1 until array.size) {
        if (array[readPointer] != array[readPointer - 1]) {
            array[writePointer] = array[readPointer]
            writePointer++
        }
    }

    return writePointer
}

fun main() {
    val res = betterRemoveDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))
    print(res)
}