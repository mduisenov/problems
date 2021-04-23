package leetcode.interview.easy.linkedlist

import leetcode.learn.linkedlist.ListNode
import java.util.*

fun isPalindrome(head: ListNode?): Boolean {

    val stack = Stack<Int>()
    var first = head

    while (first != null) {
        stack.push(first.value)
        first = first.next
    }

    var second = head

    while (second != null) {
        if (second.value != stack.pop())
            return false
        second = second.next
    }

    return true
}

internal class Solution {
    private var frontPointer: ListNode? = null
    private fun recursivelyCheck(currentNode: ListNode?): Boolean {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) return false
            if (currentNode.value != frontPointer?.value) return false
            frontPointer = frontPointer!!.next
        }
        return true
    }

    fun isPalindrome(head: ListNode?): Boolean {
        frontPointer = head
        return recursivelyCheck(head)
    }
}