package leetcode.learn.tree

import java.util.*

fun isSymmetric(root: TreeNode?): Boolean {
    return isMirror(root, root)
}

fun isMirror(t1: TreeNode?, t2: TreeNode?): Boolean {
    if (t1 == null && t2 == null) return true
    return if (t1 == null || t2 == null) false else t1.value === t2.value
            && isMirror(t1.right, t2.left)
            && isMirror(t1.left, t2.right)
}

fun isSymmetric2(root: TreeNode?): Boolean {
    val q: Queue<TreeNode?> = LinkedList()
    q.add(root)
    q.add(root)
    while (!q.isEmpty()) {
        val t1: TreeNode? = q.poll()
        val t2: TreeNode? = q.poll()
        if (t1 == null && t2 == null) continue
        if (t1 == null || t2 == null) return false
        if (t1.value != t2.value) return false
        q.add(t1.left)
        q.add(t2.right)
        q.add(t1.right)
        q.add(t2.left)
    }
    return true
}