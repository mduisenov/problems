package leetcode.interview.easy.tree

import leetcode.learn.tree.TreeNode
import java.util.*


fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0
    return if (root.left == null && root.right == null)
        1
    else
        1 + maxOf(
                maxDepth(root.left),
                maxDepth(root.right)
        )
}

fun maxDepth2(root: TreeNode?): Int {
    var root = root
    val stack: LinkedList<TreeNode> = LinkedList()
    val depths: LinkedList<Int> = LinkedList()
    if (root == null)
        return 0

    stack.add(root)
    depths.add(1)
    var depth = 0
    var currentDepth: Int
    while (!stack.isEmpty()) {
        root = stack.pollLast()
        currentDepth = depths.pollLast()
        if (root != null) {
            depth = maxOf(depth, currentDepth)
            stack.add(root.left!!)
            stack.add(root.right!!)
            depths.add(currentDepth + 1)
            depths.add(currentDepth + 1)
        }
    }
    return depth
}