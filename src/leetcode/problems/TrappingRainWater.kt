package leetcode.problems

fun trap(height: IntArray): Int {
    val n = height.size
    if (n == 0) return 0

    val l = IntArray(n)
    val r = IntArray(n)
    var max = height.first()

    for (i in 0 until n) {
        max = maxOf(max, height[i])
        l[i] = max
    }

    max = height.last()
    for (i in n - 1 downTo 0) {
        max = maxOf(max, height[i])
        r[i] = max
    }

    var res = 0
    for (i in 0 until n)
        res += minOf(l[i], r[i]) - height[i]

    return res
}

fun trap2(height: IntArray): Int {
    var left = 0; var right = height.size - 1
    var ans = 0
    var leftMax = 0; var rightMax = 0

    while(left < right) {
        if (height[left] < height[right]) {
            if (leftMax > height[left])
                ans += leftMax - height[left]
            else
                leftMax = height[left]
            left++
        } else {
            if (rightMax > height[right])
                ans += rightMax - height[right]
            else
                rightMax = height[right]
            right--
        }
    }
    return ans
}

fun main() {
    val array = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
    val res = trap(array)
    print(res)
}