/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        var rs : ArrayList<Int> = ArrayList()
        searchTree(root,rs);
        return rs
    }
    
    fun searchTree(node : TreeNode?, list : ArrayList<Int>) {
        if(node != null) {
            if(node.left == null) list.add(node.`val`)
            else {
                searchTree(node.left,list)
                list.add(node.`val`)
            }
            if(node.right != null) searchTree(node.right,list)
        }
    }
}
