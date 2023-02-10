package algorithms;
/*
 * The majority element is the element that appears more than ⌊n / 2⌋ times. 
 * You may assume that the majority element always exists in the array.
 */
public class MorresVotingAlgo_Count_Good_Numbers {
	public static void main (String args[]) {
		System.out.println(majorityELement(new int[] {2, 2, 1, 1, 1, 2, 2}));
	}
	public static int majorityELement(int []nums) {
    	int count = 0, flag = 0;
    	
    	for(int e:nums) {
    		if(count==0)flag = e;
    		
    		count = (e==flag? count+1:count-1);
    	}
    	
    	return flag;
    }
}
