//package leetcode.learn.binarysearch

/**
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

//fun guessNumber1(n: Int): Int {
//    var left = 0
//    var right = n
//    while (left <= right) {
//        val mid = (left + right) / 2
//        val answer = guess(mid)
//        when (answer) {
//            0 -> return mid
//            -1 -> right = mid - 1
//            1 -> left = mid + 1
//        }
//    }
//    return -1
//}
//
//fun guessNumber(n: Int): Int {
//    var low = 1
//    var high = n
//    while (low <= high) {
//        val mid = low + (high - low) / 2
//        val res: Int = guess(mid)
//        if (res == 0)
//            return mid
//        else if (res < 0)
//            high = mid - 1
//        else
//            low = mid + 1
//    }
//    return -1
//}
//
//fun guessNumber2(n: Int): Int {
//    var low = 1
//    var high = n
//    while (low <= high) {
//        val mid = low + (high - low) / 2
//        val res: Int = guess(mid)
//        if (res == 0)
//            return mid
//        else if (res < 0)
//            high = mid - 1
//        else
//            low = mid + 1
//    }
//    return -1
//}
//
//fun guessNumber3(n:Int):Int {
//    return find(1, n)
//}
//
//fun find(l: Int, r: Int): Int {
//    if (l >= r) {
//        return r
//    }
//    val mid = l + (r - l) / 2
//    return when {
//        guess(mid) == 0 -> {
//            mid
//        }
//        guess(mid) == -1 -> {
//            find(l, mid - 1)
//        }
//        else -> {
//            find(mid + 1, r)
//        }
//    }
//}