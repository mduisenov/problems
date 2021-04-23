package leetcode.learn.arraystring

fun minSubArrayLen(s: Int, nums: IntArray): Int {
    var left = 0; var right = 0
    var res = Int.MAX_VALUE; var sum = 0

    while (right < nums.size) {
        sum += nums[right]
        while (sum >= s) {
            res = minOf(res, right - left + 1)
            sum -= nums[left++]
        }
        right++
    }
    return if (res == Int.MAX_VALUE) 0 else res
}

class Solution {
    var ans = Integer.MAX_VALUE

    fun minSubArrayLen(S: Int, nu: IntArray): Int {
        solve(0,0,0, S, nu)
        return if (ans == Integer.MAX_VALUE) 0 else ans
    }
    private tailrec fun solve(i: Int, j: Int, su: Int, s: Int, nums: IntArray) {
        if (i >= nums.size && j >= nums.size) return
        if (su >= s) ans = minOf(ans, j-i)
        if (su >= s) solve(i+1, j, su-nums[i], s, nums)
        else if (j < nums.size) solve(i, j+1, su + nums[j], s, nums)
    }
}