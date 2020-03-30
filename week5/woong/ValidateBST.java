/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return search(root,null,null);
    }
    
    public boolean search(TreeNode root,Integer min,Integer max) {
        if (root == null) return true;
        if(max != null && root.val >= max) return false;
        if(min != null && root.val <= min) return false;
        
        if(! search(root.left,min,root.val)) return false;
        if(! search(root.right,root.val,max)) return false;
        
        return true;
    }
}
