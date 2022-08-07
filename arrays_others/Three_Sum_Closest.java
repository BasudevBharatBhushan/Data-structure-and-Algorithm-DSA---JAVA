package arrays_others;

import java.util.Arrays;
import java.math.*;

public class Three_Sum_Closest {

	public static void main(String[] args) {
		
		System.out.println(threeSumClosest(new int[] {-1, 2, 1, -4}, 2));
//		System.out.println("Solution is ------------- " + threeSumClosest(new int[] {1, 2, 3, 4, 5, 6}, 0));

	}
    public static int threeSumClosest(int[] nums, int target) {
        
    	int nearSum = 0;
    	int currDiff = 0;
    	int minDiff = Integer.MAX_VALUE;
    	
    	int n = nums.length;
    	Arrays.sort(nums);
    	
    	for(int i = 0 ; i<n-2 ; i++ ) {
    		int lo = i+1, hi = n-1;
    		while(lo<hi) {
    			int Sum_3 = (nums[i] + nums[lo]+nums[hi]);
    			if(Sum_3 == target)return Sum_3;
    			System.out.println("Sum_3 = "+ Sum_3);
    			currDiff = Math.abs(Sum_3 - target);
    			
    			System.out.println("CurrDiff = "+currDiff + " MinDiff = " + minDiff);
    			
    			if((currDiff) < minDiff) {
    				nearSum = Sum_3;
    				minDiff = (currDiff);
    			}
//    			System.out.println(minDiff + " "+ nearSum);
    			
    			if(Sum_3 < target) {
    				lo++;
    			}else {
    				hi--;
    			}
    			
    		}
    		
    	}
    	
    	
    	return nearSum;
    }

}
