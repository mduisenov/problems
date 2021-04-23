package interview.tree

import leetcode.learn.tree.TreeNode
import java.util.*


fun levelOrder(root: TreeNode?): List<Int> {
    var root: TreeNode? = root
    val result: MutableList<Int> = ArrayList<Int>()
    if (root == null) return result
    val q: Queue<TreeNode> = LinkedList()
    q.add(root)

    while (q.size > 0) {
        root = q.poll()
        result.add(root.value)
        if (root.left != null) q.add(root.left)
        if (root.right != null) q.add(root.right)
    }
    return result
}