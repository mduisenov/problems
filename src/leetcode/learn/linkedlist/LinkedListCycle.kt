package leetcode.learn.linkedlist

fun hasCycle(head: ListNode?): Boolean {
    var slow = head
    var fast = head?.next
    while (slow != null && fast != null) {
        if (slow == fast)
            return true

        slow = slow.next
        fast = fast.next?.next
    }
    return false
}

fun detectCycle(head: ListNode?): ListNode? {
    if (head?.next == null)
        return null

    var slow = head
    var fast = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next

        if (slow == fast)
            break
    }

    var start= head
    while (start != slow) {
        start = start?.next
        slow = slow?.next
    }
    return start
}

fun main() {
    val fourth = ListNode(-4)
    val third = ListNode(0)
    third.next = fourth
    val second = ListNode(2)
    second.next = third
    val head = ListNode(3)
    head.next = second
    fourth.next = second

    val res = detectCycle(head)
    print(res?.value)
}