package interview

import leetcode.learn.tree.TreeNode
import java.util.*


fun inorderTraversal(root: TreeNode): List<Int> {
    var root: TreeNode? = root
    val list: MutableList<Int> = ArrayList()
    val stack: Stack<TreeNode> = Stack()
    while (stack.size > 0 || root != null) {
        while (root != null) {
            stack.add(root)
            root = root.left
        }
        root = stack.pop()
        list.add(root.value)
        root = root.right
    }
    return list
}

fun preorderTraversal(root: TreeNode): List<Int> {
    var root: TreeNode? = root
    val list: MutableList<Int> = ArrayList<Int>()
    val stack: Stack<TreeNode?> = Stack()
    stack.add(root)
    while (!stack.isEmpty()) {
        root = stack.pop()
        list.add(root!!.value)
        if (root.right != null) stack.add(root.right)
        if (root.left != null) stack.add(root.left)
    }
    return list
}

fun postorderTraversal(root: TreeNode?): List<Int?>? {
    var root = root
    val list: MutableList<Int> = ArrayList<Int>()
    val stack: Stack<TreeNode> = Stack()

    while (!stack.isEmpty() || root != null) {
        if (root != null) {
            stack.add(root)
            root = root.left
        } else {
            var temp = stack.peek().right
            if (temp == null) {
                temp = stack.pop()
                list.add(temp.value)
                while (!stack.isEmpty() && temp === stack.peek().right) {
                    temp = stack.pop()
                    list.add(temp.value)
                }
            } else
                root = temp

        }
    }
    return list
}


fun postorderTraversal2(root: TreeNode): List<Int> {
    var root = root
    val list: MutableList<Int> = ArrayList<Int>()
    val stack: Stack<TreeNode> = Stack()
    stack.add(root)

    while (!stack.isEmpty()) {
        root = stack.pop()
        list.add(root.value)
        if (root.left != null) stack.add(root.left)
        if (root.right != null) stack.add(root.right)
    }
    list.reverse()
    return list
}

