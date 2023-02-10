package arrays_others;

/*
 * Given a binary array nums and an integer k, 
 * return the maximum number of consecutive 1's 
 * in the array if you can flip at most k 0's.
 */

public class Max_Consecutive_Ones_III {

	public static void main(String[] args) {
		int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
		
		System.out.println(longestOnes(arr, 2)); 

	}
	public static int longestOnes(int[] nums, int k) {
        
		int zeroCount = 0, i = 0;
		
		int result = 0;
		
		for(int j = 0; j< nums.length; j++) {
			
			if(nums[j]==0)zeroCount++;
			
			while(zeroCount > k) {
				if(nums[i]==0)zeroCount--;
				
				i++;
			}
			result = Math.max(result, j-i+1);
		}
		return result;
		
    }

}
