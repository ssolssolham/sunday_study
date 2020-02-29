package practice;

import java.util.ArrayList;
import java.util.List;

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
}
