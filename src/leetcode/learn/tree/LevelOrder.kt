package leetcode.learn.tree

import java.util.*


fun levelOrder(root: TreeNode?): List<List<Int>> {
    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)
    val answer: MutableList<List<Int>> = ArrayList()

    while (queue.peek() != null) {
        val arrList: MutableList<Int> = ArrayList()
        for (i in queue.indices) {
            val removed = queue.remove()
            if (removed!!.left != null) queue.add(removed.left)
            if (removed.right != null) queue.add(removed.right)
            arrList.add(removed.value)
        }
        answer.add(arrList)
    }
    return answer
}

fun main() {
    val node = TreeNode(1)
    val node2 = TreeNode(2)
    val node3 = TreeNode(3)
    node.left = null
    node.right = node2
    node2.left = node3

    val res = levelOrder(null)
    print(res)
}