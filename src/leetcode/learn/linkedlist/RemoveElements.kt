package leetcode.learn.linkedlist

fun removeElements(head: ListNode?, value: Int): ListNode? {
    val dummy = ListNode(0)
    dummy.next = head
    var current: ListNode? = dummy

    while (current!!.next != null) {
        if (current.next?.value == value) {
            val next = current.next
            current.next = next!!.next
        } else {
            current = current.next
        }
    }
    return dummy.next
}

fun main() {

    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node6 = ListNode(6)
    val node3 = ListNode(3)
    val node4 = ListNode(4)
    val node5 = ListNode(5)

    node1.next = node2
    node2.next = node6
    node6.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = ListNode(6)

    val res = removeElements(node1, 6)
    print(res)
}
