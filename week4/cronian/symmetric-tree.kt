class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        return searchIn(root,root)
    }
    
    fun searchIn(left : TreeNode?, right: TreeNode?) : Boolean {
        if ( left == null && right == null) return true
        if ( left == null || right == null) return false
        if ( left.`val` == right.`val` ) {
            return searchIn(left.left,right.right) && searchIn(left.right,right.left)
        } else {
            return false;
        }
        
    }
}
