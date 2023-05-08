package recursion_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Each number can be used once
 */
public class Combination_Sum_II {

	public static void main(String[] args) {
		int nums[] = {1 , 1, 1, 2,2};

		System.out.println(combinationSum2(nums, 4));

	}
	public static List<List<Integer>> combinationSum2(int[]candidates, int target) {
		
		Arrays.sort(candidates);
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer>ds = new ArrayList<>();

		combinationSum2(0, candidates, ans, ds, target);

		return ans;
	}

	private static void combinationSum2(int i, int nums[] , List<List<Integer>>ans, List<Integer> ds, int target) {

		//--> Base Case 1
		if(target==0) {
			ans.add(new ArrayList<Integer>(ds));
			return;
		}


		for(int j = i; j<nums.length; j++) {
			
			/*Avoid Duplicate combination*/
			if(j>i && nums[j]==nums[j-1])continue; 

			if(nums[j]>target)break;

			ds.add(nums[j]);
			
			combinationSum2(j+1, nums, ans, ds, target-nums[j]);

			ds.remove(ds.size()-1);
		}
	}

}
