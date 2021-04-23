package leetcode.learn.linkedlist

class Node(
        val value: Int,
        var next: Node? = null) {

    override fun toString(): String {
        return if (next != null)
            "$value -> $next"
        else
            "$value"
    }
}

class MyLinkedList() {

    /** Initialize your data structure here. */
    var head: Node? = null
        private set
    var size: Int = 0
        private set

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    fun get(index: Int): Int {
        if (index < 0 || index >= size)
            return -1

        var i = 0
        var current = head
        while (current != null) {
            if (i == index) {
                return current.value
            }
            current = current.next
            i++
        }

        return -1
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    fun addAtHead(value: Int) {
        head = Node(value, head)
        size++
    }

    /** Append a node of value val to the last element of the linked list. */
    fun addAtTail(value: Int) {
        if (size == 0) {
            addAtHead(value)
            return
        }

        var current = head
        while (current?.next != null) {
            current = current.next
        }
        current!!.next = Node(value)
        size++
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    fun addAtIndex(index: Int, value: Int) {
        if (index < 0 || index > size)
            return

        if (index == 0) {
            addAtHead(value)
            return
        }

        if (index == size) {
            addAtTail(value)
            return
        }

        val node = Node(value)
        var current = head
        var i = 0
        while (current != null) {
            if (i == index - 1) {
                val next = current.next
                current.next = node
                node.next = next
            }
            current = current.next
            i++
        }
        size++
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    fun deleteAtIndex(index: Int) {
        if (index < 0 || index >= size)
            return

        if (index == 0) {
            head = head?.next
            size--
            return
        }

        var i = 0
        var current = head
        while (current != null) {
            if (i == index - 1) {
                if (index == size)
                    current.next = null
                 else
                    current.next = current.next!!.next
            }

            current = current.next
            i++
        }
        size--
    }

    override fun toString(): String {
        return head?.toString() ?: "empty"
    }
}

fun main() {
    val linkedList = MyLinkedList()
//    linkedList.addAtHead(7)
//    linkedList.get(1)
//    linkedList.addAtHead(2)
//    linkedList.addAtHead(1)
//    linkedList.addAtIndex(3,0)
//    linkedList.deleteAtIndex(2)
//    linkedList.addAtHead(6)
//    linkedList.addAtTail(4)
//    linkedList.addAtHead(4)
//    linkedList.addAtIndex(5,0)
//    linkedList.addAtHead(6)

    // 2
    linkedList.addAtHead(9)
    linkedList.get(1)
    linkedList.addAtIndex(1, 1)
    linkedList.addAtIndex(1, 7)
    linkedList.deleteAtIndex(1)
    linkedList.addAtHead(7)
    linkedList.addAtHead(4)
    linkedList.deleteAtIndex(1)
    linkedList.addAtIndex(1, 4)
    linkedList.addAtHead(2)
    println(linkedList)
    println(linkedList.size)
    linkedList.deleteAtIndex(5)


    // test
    print(linkedList)
//    linkedList.addAtIndex(2, 5)
//    linkedList.deleteAtIndex(7)
//    var param = linkedList.get(0)
}