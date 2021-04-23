package leetcode.interview.uber

import leetcode.learn.linkedlist.ListNode
import java.util.*

fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    val queue = PriorityQueue<Int>()

    for (i in lists.indices) {
        val node = lists[i]
        var current: ListNode? = node

        while (current != null) {
            queue.offer(current.value)
            current = current.next
        }
    }

    val sortedRoot = ListNode(-1)
    var sorted: ListNode? = sortedRoot

    queue.forEach {
        sorted?.next = ListNode(it)
        sorted = sorted?.next
    }
    return sortedRoot.next
}

fun main() {
    val root1 = ListNode(5)
    val node2 = ListNode(4)
    val node3 = ListNode(3)
    root1.next = node2
    node2.next = node3

    val root2 = ListNode(2)
    val node22 = ListNode(7)
    val node23 = ListNode(1)
    root2.next = node22
    node22.next = node23

    val res = mergeKLists(arrayOf(root1, root2))
    print(res)
}

