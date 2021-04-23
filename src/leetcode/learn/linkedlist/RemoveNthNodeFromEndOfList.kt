package leetcode.learn.linkedlist

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {

    val dummy: ListNode? = ListNode(0)
    dummy?.next = head

    var fast = dummy
    var slow = dummy

    for (i in 1 .. n + 1) {
        fast = fast?.next
    }

    while (fast != null) {
        fast = fast.next
        slow = slow?.next
    }

    slow?.next = slow?.next?.next
    return dummy?.next
}

fun main() {
    val node = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    val node4 = ListNode(4)
    val node5 = ListNode(5)
    node.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5

    val res = removeNthFromEnd(node, 2)
    print(res)
}