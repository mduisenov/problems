package leetcode.learn.tree

import java.util.*


fun preorderTraversal(root: TreeNode?): List<Int> {
    var curr: TreeNode? = root
    val stack: Stack<TreeNode> = Stack()
    val answer: MutableList<Int> = ArrayList()

    while (curr != null || !stack.isEmpty()) {
        if (curr != null) {
            answer.add(curr.value)
            stack.add(curr)
            curr = curr.left
        } else {
            if (!stack.isEmpty()) curr = stack.pop().right
        }
    }
    return answer
}

fun inorderTraversal(root: TreeNode?): List<Int> {
    val res: MutableList<Int> = ArrayList()
    val stack: Stack<TreeNode> = Stack()
    var root = root

    while (root != null || !stack.isEmpty()) {
        while (root != null) {
            stack.push(root)
            root = root.left
        }
        root = stack.pop()
        res.add(root.value)
        root = root.right
    }
    return res
}

fun postorderTraversal(root: TreeNode?): List<Int> {
    val deque: Deque<Int> = LinkedList()
    val stack: Stack<TreeNode?> = Stack()
    if (root != null) {
        stack.push(root)
    }
    while (!stack.isEmpty()) {
        val node = stack.pop()
        deque.offerFirst(node?.value)
        if (node!!.left != null) {
            stack.push(node.left)
        }
        if (node.right != null) {
            stack.push(node.right)
        }
    }
    return ArrayList(deque)
}

fun inorderTraversal2(root: TreeNode?): List<Int> {
    val res: MutableList<Int> = ArrayList()
    var curr = root
    var pre: TreeNode?

    while (curr != null) {
        if (curr.left == null) {
            res.add(curr.value)
            curr = curr.right // move to next right node
        } else { // has a left subtree
            pre = curr.left
            while (pre!!.right != null) { // find rightmost
                pre = pre.right
            }
            pre.right = curr // put cur after the pre node
            val temp: TreeNode = curr // store cur node
            curr = curr.left // move cur to the top of the new tree
            temp.left = null // original cur left be null, avoid infinite loops
        }
    }
    return res
}

fun main() {
    val node = TreeNode(1)
    val node2 = TreeNode(2)
    val node3 = TreeNode(3)
    node.left = null
    node.right = node2
    node2.left = node3

    val res = postorderTraversal(node)
    print(res)
}