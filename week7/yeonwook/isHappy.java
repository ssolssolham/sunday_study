package test;

import java.util.HashSet;
import java.util.Set;

class Solution
{
	
	public static void main(String args[]) {
		
		int a = 19;
		
		System.out.println(isHappy(a));
	}
	
    public static boolean isHappy(int n) {
    	
    	Set<Integer> checkSet = new HashSet<Integer>();
    	int target = n;
    	int checkVal = 0;
    	int quotient = 0;
    	
    	while(true) {
    		
    		if(target == 1) {
    			return true;
    		}
    		
    		checkVal = 0;
    		while(target > 0) {
    			
    			quotient = target % 10;
    			target = target / 10;
    			
    			checkVal += quotient*quotient;
    		}
    		
    		if(checkSet.contains(checkVal)) {
				return false;
			}
    		
    		if(checkVal==1) {
				break;
			}
    		
    		checkSet.add(checkVal);
    		target = checkVal;
    		
    	}
    	
    	return true;
    }
}

