package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	
	public static void main(String[] args) {
		
		TreeNode tn = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		tn.left = null;
		tn.right = tn2;
		tn2.left = tn3;
		
		A a = new A();
		System.out.println(a.inorderTraversal(tn));
		
		for(Integer i : A.list) {
			System.out.println(i);
		}
		
	}
}

class A {
	
	static List<Integer> list = new ArrayList<Integer>();
	
    public List<Integer> inorderTraversal(TreeNode root) {
        
    	
    	if(root==null) {
    		return list;
    	}
    	
   		inorderTraversal(root.left);
    	list.add(root.val);
   		inorderTraversal(root.right);
    	
    	return list;
    }
    
    public List<Integer> inorderTraversal2(TreeNode root) {
        
    	List<Integer> returnList = new ArrayList<Integer>();
    	Stack<TreeNode> st = new Stack<TreeNode>();
    	
    	TreeNode leftNode = root;
    	while(leftNode != null) {
    		st.add(leftNode);
    		leftNode = leftNode.left;
    	}
    	
    	while(!st.isEmpty()) {
    		TreeNode rightNode = st.pop();
    		returnList.add(rightNode.val);
    		
    		rightNode = rightNode.right;
    		while(rightNode != null) {
    			st.add(rightNode);
    			rightNode = rightNode.left;
    		}
    	}
    	
		return returnList;
		
    }
    
    public List<Integer> preOrderTraversal(TreeNode root) {
        
    	List<Integer> returnList = new ArrayList<Integer>();
    	Stack<TreeNode> st = new Stack<TreeNode>();
    	
    	st.add(root);
    	
    	while(!st.isEmpty()) {
    		TreeNode node = st.pop();
    		returnList.add(node.val);
    		
    		if(node.right != null) {
    			st.add(node.right);
    		}
    		
    		if(node.left != null) {
    			st.add(node.left);
    		}
    	}
    	
		return returnList;
		
    }
}
