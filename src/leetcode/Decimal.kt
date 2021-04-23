package leetcode

import kotlin.math.pow

class ListNode(var value: Int) {
    var next: ListNode? = null
}

fun getDecimalValue(head: ListNode?): Int {
    val binary = StringBuilder()
    var current = head

    while (current != null) {
        binary.append(current.value)
        current = current.next
    }

    return binaryToDecimal(binary.toString())
}

private fun binaryToDecimal(binary: String): Int {
    var num = binary.toLong()
    var decimalNumber = 0
    var i = 0
    var remainder: Long

    while (num.toInt() != 0) {
        remainder = num % 10
        num /= 10
        decimalNumber += (remainder * 2.0.pow(i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}

fun main() {
    val array = arrayOf(1,0,1,0,0,1,1,1,0,1,1,0,0,0,0,0,0,0,0,1)
    var node: ListNode? = null
    var current = node

    for (a in array) {
        val new = ListNode(a)
        if (node == null) {
            node = new
            continue
        } else {
            current = node
            node.next = new
        }
    }
    val res = getDecimalValue(node)
    print(res)
}