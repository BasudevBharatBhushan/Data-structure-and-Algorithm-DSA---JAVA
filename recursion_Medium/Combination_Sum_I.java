package recursion_Medium;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_I {
	public static void main(String args[]) {
		
		int nums[] = {2, 3, 6, 7};
		
		System.out.println(combinationSum1(nums, 7));
		
	}
	
	public static List<List<Integer>> combinationSum1(int[]candidates, int target) {
		
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer>ds = new ArrayList<>();
		
		combinationSum1(0, candidates, ans, ds, target);
		
		return ans;
	}
	
	private static void combinationSum1(int i, int nums[] , List<List<Integer>>ans, List<Integer> ds, int target) {
		
		//--> Base Case 1
		if(target==0) {
			ans.add(new ArrayList<Integer>(ds));
			return;
		}
		
		//-->Base Case 2
		if(i==nums.length) {
			return;
		}
		
		/**Recursive Logic**/
		
		if(nums[i]<=target) {
			
			//-->Pick
			ds.add(nums[i]);
			combinationSum1(i, nums, ans, ds, target-nums[i]);
			ds.remove(ds.size()-1);
			
		}
		//-->Not Pick
		combinationSum1(i+1, nums, ans, ds, target);
	}
	
}	
