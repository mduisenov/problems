package leetcode.interview.easy.linkedlist

import leetcode.learn.linkedlist.ListNode

fun mergeTwoLists2(l1: ListNode?, l2: ListNode?): ListNode? {
    return when {
        l1 == null -> l2
        l2 == null -> l1
        l1.value < l2.value -> {
            l1.next = mergeTwoLists2(l1.next, l2)
            l1
        }
        else -> {
            l2.next = mergeTwoLists2(l1, l2.next)
            l2
        }
    }
}

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    var answer: ListNode? = ListNode(-1)
    var current1 = l1
    var current2 = l2
    var answerHead = answer
    while (current1 != null || current2 != null) {
        if (current1 != null && current2 != null) {
            if (current1.value < current2.value) {
                answerHead?.next = current1
                current1 = current1.next
            } else {
                answerHead?.next = current2
                current2 = current2.next
            }
        } else if (current1 != null) {
            answerHead?.next = current1
            current1 = current1.next

        } else if (current2 != null) {
            answerHead?.next = current2
            current2 = current2.next
        }
        answerHead = answerHead?.next
    }

    return answer?.next
}

fun main() {
    val head1 = ListNode(1)
    val l1v2 = ListNode(2)
    val l1v4 = ListNode(4)
    head1.next = l1v2
    l1v2.next = l1v4

    val head2 = ListNode(1)
    val l2v2 = ListNode(3)
    val l4v4 = ListNode(4)
    head2.next = l2v2
    l2v2.next = l4v4

    val res = mergeTwoLists2(head1, head2)
    print(res)
}