package arrays;
/*
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
import java.util.*;
public class Two_Sum {

	public static void main(String[] args) {
		
		int nums[]= {3,2,4};
		
		int newNums[] = twoSum(nums, 6);
		
//		int arr[] = {-1, 0, 1 , 2, -1, 4};
		
//		int newarr[] = twoSum(arr, 1);
		
		
		for(int e:newNums) {
			System.out.print(e+" ");
		}
		
	}

    public static int[] twoSum(int[] nums, int target) {
    	
    	int n = nums.length;
    	int res[] = new int[2];
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for(int i = 0; i<n; i++) {
    		int diff = target - nums[i];
    		if(!map.containsKey(diff)) 
    			map.put(nums[i], i);
    		else {
    			res[0] = map.get(diff);
    			res[1]=i;
    			return res;
    		}
    	}
    	return new int[] {};
    }

}
