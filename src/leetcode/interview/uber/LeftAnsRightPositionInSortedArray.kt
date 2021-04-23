package leetcode.interview.uber

fun searchRange(nums: IntArray, target: Int): IntArray {
    val answer = IntArray(2) { -1 }

    for (i in nums.indices) {
        if (nums[i] == target) {
            answer[0] = i; break
        }
    }
    if (answer[0] == -1)
        return answer

    for (i in nums.size - 1 downTo 0) {
        if (nums[i] == target) {
            answer[1] = i; break
        }
    }

    return answer
}

internal class Solution {
    // returns leftmost (or rightmost) index at which `target` should be
    // inserted in sorted array `nums` via binary search.
    private fun extremeInsertionIndex(nums: IntArray, target: Int, left: Boolean): Int {
        var lo = 0
        var hi = nums.size
        while (lo < hi) {
            val mid = (lo + hi) / 2
            if (nums[mid] > target || left && target == nums[mid]) {
                hi = mid
            } else {
                lo = mid + 1
            }
        }
        return lo
    }

    fun searchRange(nums: IntArray, target: Int): IntArray {
        val targetRange = intArrayOf(-1, -1)
        val leftIdx = extremeInsertionIndex(nums, target, true)

        // assert that `leftIdx` is within the array bounds and that `target`
        // is actually in `nums`.
        if (leftIdx == nums.size || nums[leftIdx] != target) {
            return targetRange
        }
        targetRange[0] = leftIdx
        targetRange[1] = extremeInsertionIndex(nums, target, false) - 1
        return targetRange
    }
}

fun main() {
    val res = searchRange(intArrayOf(), 6)
    print(res.contentToString())
}