package leetcode.interview.easy.tree

import leetcode.learn.tree.TreeNode
import java.util.*

// Approach 1: Recursion
fun helper(node: TreeNode?, lower: Int?, upper: Int?): Boolean {
    if (node == null) return true
    val value: Int = node.value
    if (lower != null && value <= lower) return false
    if (upper != null && value >= upper) return false
    if (!helper(node.right, value, upper)) return false
    return helper(node.left, lower, value)
}

fun isValidBST(root: TreeNode?): Boolean {
    return helper(root, null, null)
}

// Approach 2: Iteration
fun isValidBST2(root: TreeNode?): Boolean {
    var root = root
    val stack: Stack<TreeNode> = Stack()
    var inorder = -Int.MAX_VALUE
    while (!stack.isEmpty() || root != null) {
        while (root != null) {
            stack.push(root)
            root = root.left
        }
        root = stack.pop()
        // If next element in inorder traversal
        // is smaller than the previous one
        // that's not BST.
        if (root.value <= inorder) return false
        inorder = root.value
        root = root.right
    }
    return true
}

// Approach 3: Inorder traversal
internal class Solution {
    var stack: LinkedList<TreeNode?> = LinkedList()
    var uppers: LinkedList<Int?> = LinkedList()
    var lowers: LinkedList<Int?> = LinkedList()

    fun update(root: TreeNode?, lower: Int?, upper: Int?) {
        stack.add(root)
        lowers.add(lower)
        uppers.add(upper)
    }

    fun isValidBST(root: TreeNode?): Boolean {
        var root = root
        var lower: Int? = null
        var upper: Int? = null
        var value: Int
        update(root, lower, upper)
        while (!stack.isEmpty()) {
            root = stack.poll()
            lower = lowers.poll()
            upper = uppers.poll()
            if (root == null) continue
            value = root.value
            if (lower != null && value <= lower) return false
            if (upper != null && value >= upper) return false
            update(root.right, value, upper)
            update(root.left, lower, value)
        }
        return true
    }
}
