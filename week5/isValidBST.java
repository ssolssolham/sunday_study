package practice;

import java.util.Stack;

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
	
	public static void main (String args[]) {
		
		//Input: [2,1,3]
		/*
		TreeNode tn = new TreeNode(2);
		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(3);
		tn.left = tn1;
		tn.right = tn2;
		
		System.out.println(isValidBST(tn));
		*/
		
		//[5,1,4,null,null,3,6]
		//[10,5,15,null,null,6,20]
		
		/*
		TreeNode tn = new TreeNode(10);
		TreeNode tn1 = new TreeNode(5);
		TreeNode tn2 = new TreeNode(15);
		TreeNode tn3 = new TreeNode(6);
		TreeNode tn4 = new TreeNode(20);
		tn.left = tn1;
		tn.right = tn2;
		tn1.left = null;
		tn1.right = null;
		tn2.left = tn3;
		tn2.right = tn4;
		
		
		System.out.println(isValidBST(tn));
		*/
		
		//[0]
		
		TreeNode tn = new TreeNode(0);
		System.out.println(isValidBST(tn));
		
	}
	
    public static boolean isValidBST(TreeNode root) {
    	
    	if(root == null) {
    		return true;
    	}
    	
    	Stack<TreeNode> st = new Stack<TreeNode>();
    	
    	TreeNode leftNode = root;
    	while(leftNode != null) {
    		st.push(leftNode);
    		leftNode = leftNode.left;
    	}
    	
    	double inorder = - Double.MAX_VALUE;
    	while(!st.isEmpty()) {
    		TreeNode node = st.pop();
    		
    		System.out.println(node.val);
    		if( node.val <= inorder) {
    			return false;
    		}
    		inorder = node.val;
    		
    		TreeNode rightNode = node.right;
    		while(rightNode != null) {
    			st.push(rightNode);
    			rightNode = rightNode.left;
    		}
    		
    	}


    	return true;
    }
}