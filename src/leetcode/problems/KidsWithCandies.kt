package leetcode.problems

fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
    val answer = BooleanArray(candies.size)
    val max = candies.max()!!
    for (i in candies.indices) {
        answer[i] = (candies[i] + extraCandies) >= max
    }
    return answer
}