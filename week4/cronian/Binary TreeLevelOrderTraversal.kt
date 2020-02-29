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
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        var rs  = ArrayList<ArrayList<Int>>()
        searchTreeLevel(root,rs,0)
        return rs
    }
    
    fun searchTreeLevel(node : TreeNode?,rs : ArrayList<ArrayList<Int>>,level : Int) {
        if(node != null) {
            if(rs.getOrNull(level) == null) {
                val tmp = ArrayList<Int>()
                tmp.add(node.`val`)
                rs.add(tmp)
            }
            else  {
                val tmp = rs.get(level)
                tmp.add(node.`val`)
                rs.set(level,tmp)
                //rs.set(level,rs.get(level).add(node.`val`))
            }

            if(node.left != null) searchTreeLevel(node.left,rs,level+1)
            if (node.right != null) searchTreeLevel(node.right,rs,level+1)
        }
    }
}
