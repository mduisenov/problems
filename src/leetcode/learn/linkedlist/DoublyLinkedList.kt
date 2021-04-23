package leetcode.learn.linkedlist

class DoublyLinkedList() {

    private var head: Node? = null
    private var length = 0

    /** Initialize your data structure here. */


    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    fun get(index: Int): Int {
        return findAtIndex(index)?.value ?: -1
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    fun addAtHead(value: Int) {
        addAtIndex(0, value)
    }

    /** Append a node of value val to the last element of the linked list. */
    fun addAtTail(value: Int) {
        addAtIndex(length, value)
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    fun addAtIndex(index: Int, value: Int) {
        if (index > length) {
            return
        }
        val old = findAtIndex(index - 1)
        val node = Node(value)
        when {
            old == null -> head = node
            index == 0 -> {
                node.next = head
                head = node
            }
            else -> {
                node.next = old.next
                old.next = node
            }
        }
        length++
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    fun deleteAtIndex(index: Int) {
        when {
            length == 0 || index > length - 1 || index < 0 -> return
            index == 0 -> head = head?.next
            else -> findAtIndex(index - 1)?.let {
                it.next = it.next?.next
            }
        }
        length--
    }

    private fun findAtIndex(index: Int): Node? =
            when {
                length == 0 || index > length - 1 -> null
                index <= 0 -> head
                else -> {
                    var next = head?.next
                    repeat(index - 1) {
                        next = next?.next
                    }
                    next
                }
            }

    private data class Node(val value: Int, var next: Node? = null) {
        override fun toString(): String {
            return if (next != null)
                "$value -> $next"
            else
                "$value"
        }
    }

}

fun main() {

    val myLinkedList = DoublyLinkedList()
    myLinkedList.addAtHead(7)
    myLinkedList.addAtHead(2)
    myLinkedList.addAtHead(1)
    myLinkedList.addAtIndex(3, 0 )
    myLinkedList.deleteAtIndex(2) // linked list becomes 1->2->3
    myLinkedList.addAtHead(6) // linked list becomes 1->2->3
    myLinkedList.addAtTail(4) // linked list becomes 1->2->3
    val a = myLinkedList.get(4) // linked list becomes 1->2->3
    myLinkedList.addAtHead(4) // linked list becomes 1->2->3
    myLinkedList.addAtIndex(5,0) // linked list becomes 1->2->3
    myLinkedList.addAtHead(6) // linked list becomes 1->2->3

    println(a)
    print(myLinkedList)
}