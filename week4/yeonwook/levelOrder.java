package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	
	public static void main(String[] args) {
		
		TreeNode tn = new TreeNode(3);
		TreeNode tn1 = new TreeNode(2);
		TreeNode tn2 = new TreeNode(4);
		TreeNode tn3 = new TreeNode(5);
		tn.left = tn1;
		tn.right = tn2;
		tn2.right = tn3;
		
		A a = new A();
		List<List<Integer>> list1 = a.levelOrder(tn);
		
		for(List<Integer> list2 : list1) {
			
			for(Integer it : list2) {
				
				System.out.print(it+" ");
			}
			
			System.out.println("");
		}
		
	}
}

class A {
	
    public List<List<Integer>> levelOrder(TreeNode root) {
        
    	List<List<Integer>> returnList = new ArrayList<List<Integer>>();
    	
    	if(root==null) {
    		return returnList;
    	}
    	
     	Queue<TreeNode> nodeQueue = new LinkedList<>();
     	Queue<TreeNode> subNodeQueue = new LinkedList<>();
    	
     	nodeQueue.add(root);
     	
     	boolean flag = true;
     	
    	while(flag) {
    		
    		List<Integer> list = new ArrayList<Integer>();
    		while(!nodeQueue.isEmpty()) {
    			TreeNode tempNode = nodeQueue.poll();
    			if(tempNode!=null) {
    				list.add(tempNode.val);
    				subNodeQueue.add(tempNode.left);
        			subNodeQueue.add(tempNode.right);
    			}
    		} 
    		
    		if(subNodeQueue.isEmpty()) {
    			break;
    		}
    		
    		nodeQueue.clear();
    		while(!subNodeQueue.isEmpty()) {
    			nodeQueue.add(subNodeQueue.poll());
    		}
    		subNodeQueue.clear();
    		
    		returnList.add(list);
    		
    	}
    	
    	return returnList;
    }
}
