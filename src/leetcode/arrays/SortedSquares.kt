package leetcode.arrays

fun sortedSquares(nums: IntArray): IntArray {
    val squareArray = nums.map { n: Int -> n * n}
    return squareArray.toIntArray().sortedArray()
}

fun main() {
    val res = sortedSquares(intArrayOf(-7,-3,2,3,11))
    print(res.contentToString())
}