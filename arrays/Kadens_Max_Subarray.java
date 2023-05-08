package arrays;

public class Kadens_Max_Subarray {

	public static void main(String[] args) {

	}
	
	/* O(n) Approach */
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i< nums.length; i++){

            currSum+=nums[i];
            maxSum= Math.max(maxSum, currSum);

            if(currSum<0)currSum=0;
        }

        return maxSum;

    }
    
    /*Divide And Conquer*/
    public int maxSubArray1(int[] nums) {
    	return 0;
    }
	

}
