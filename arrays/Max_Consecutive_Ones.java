package arrays;

public class Max_Consecutive_Ones {

	public static void main(String[] args) {
		
		System.out.print(findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));

	}
	public static int findMaxConsecutiveOnes(int[] nums) {
	        
		int maxHere = 0, max = 0;
        for (int n : nums)
            max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
        return max; 
	        
	    } 

}
