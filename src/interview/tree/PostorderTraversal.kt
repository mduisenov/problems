package interview.tree

import leetcode.learn.tree.TreeNode
import java.util.*


fun postorderTraversal(root: TreeNode?): List<Int> {
    val list: MutableList<Int> = ArrayList<Int>()
    dfs(root, list)
    return list
}

private fun dfs(root: TreeNode?, list: MutableList<Int>) {
    if (root == null) return
    dfs(root.left, list)
    dfs(root.right, list)
    list.add(root.value)
}