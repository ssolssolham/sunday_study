package test;

class Solution
{
	
	public static void main(String args[]) {
		
		int[] a  = new int[]{2,2,1};
		System.out.println(singleNumber(a));
	}
	
	public static int singleNumber(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			
			if(i==nums.length-1) {
				return nums[i];
			}
			for(int j=0; j<nums.length; j++) {
				if(i!=j && nums[j] == nums[i]) {
					break;
				}
				
				if(j==nums.length-1) {
					return nums[i];
				} 
			}
		}
		
		return -1;
		
    }
}

