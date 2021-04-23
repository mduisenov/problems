package interview.tree

import leetcode.learn.tree.TreeNode
import java.util.*


fun preorderTraversal(root: TreeNode?): List<Int?>? {
    val list: MutableList<Int> = ArrayList<Int>()
    dfs(root, list)
    return list
}

private  fun dfs(root: TreeNode?, list: MutableList<Int>) {
    if (root == null) return
    list.add(root.value)
    dfs(root.left, list)
    dfs(root.right, list)
}