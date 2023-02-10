package arrays;

public class Max_Consecutive_Ones {

	public static void main(String[] args) {
		
		System.out.print(findMaxConsecutiveOnes1(new int[] {1,1,0,1,1,1}));

	}
	public static int findMaxConsecutiveOnes(int[] nums) {
	        
		int maxHere = 0, max = 0;
        for (int n : nums)
            max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
        return max; 
	        
	    } 
	
	/*----Dry Run------
	
	1st - maxHere = 1
	2nd - maxHere = 2
	3rd - maxHere = 0
	4th - maxHere = 1
	5th - maxHere = 2
	6th - maxHere = 3

	-----------------*/
	
	
	 public static int findMaxConsecutiveOnes1(int[] nums) {
	        int permanent_max = 0;
	        int temporary_max = 0;
	        int n = nums.length;

	        int i = 0;
	        while( i< n ){
	           if(nums[i]==1){
	               temporary_max = 1;
	               while(i<n-1 && nums[i+1]==1) {
	            	   temporary_max++;
	            	   i++;
	               }

	               permanent_max = Math.max(permanent_max, temporary_max);
	
	           }
	           i++;
	        }

	        return permanent_max;
	    }

}
