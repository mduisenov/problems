package leetcode.interview.easy.linkedlist

import leetcode.learn.linkedlist.ListNode

fun deleteNode(node: ListNode?) {
    node?.value = node?.next?.value!!
    node.next = node.next?.next
}