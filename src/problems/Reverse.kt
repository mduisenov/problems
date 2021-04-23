package problems

class Node(
        val value: Int,
        var next: Node? = null
)

fun main() {
    var node: Node? = Node(1, Node(2, Node(3)))

    var answer: Node? = Node(0)
    while(node != null) {
        print(node.value)
        answer?.next = Node(node.value)
        node = node.next
    }

//   val list = lisoff
}

// fun reverse(node: Node): Node {
//     val root = node

//     while(root.next != null) {

//     }
// }