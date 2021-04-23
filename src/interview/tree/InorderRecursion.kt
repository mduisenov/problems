package interview.tree

import leetcode.learn.tree.TreeNode
import java.util.*


fun inorderTraversal(root: TreeNode?): List<Int> {
    val list: MutableList<Int> = ArrayList<Int>()
    dfs(root, list)
    return list
}

private fun dfs(root: TreeNode?, list: MutableList<Int>) {
    if (root == null)
        return
    dfs(root.left, list)
    list.add(root.value)
    dfs(root.right, list)
}