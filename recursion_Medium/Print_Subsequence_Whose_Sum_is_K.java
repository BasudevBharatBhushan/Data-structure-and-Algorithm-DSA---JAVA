package recursion_Medium;

import java.util.*;

public class Print_Subsequence_Whose_Sum_is_K {

	public static void main(String[] args) {
		
		List<Integer> ds = new ArrayList<>();
		int nums[] = {1, 2, 1};
		
		System.out.println(subset_with_sum_K(nums, 2));
		
		
		subset_with_1sum_K(0, nums, ds, 2, 0);
		
		System.out.println(subsetCount_with_sum_K(0, nums, 2, 0));
		
		
	}
	
	public static List<List<Integer>> subset_with_sum_K(int nums[] , int k){
		List<Integer> ds = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		
		subset_with_sum_K(0, nums, ans, ds, k, 0);
		
		return ans;
		
	}
	
/***Print All subsequences with sum k***/
	
	public static void subset_with_sum_K (int i, int nums[] ,List<List<Integer>> ans, List<Integer>ds, int k, int sum) {
		
		//-->Base Case
		if(i==nums.length) {
			if(sum == k) {
				ans.add(new ArrayList<Integer>(ds));
//				System.out.println(ds);
			}
			return;
		}
		
		//--> Take
		ds.add(nums[i]);
		sum+=nums[i];
		subset_with_sum_K(i+1, nums,ans, ds, k, sum);
		
		//-->Not Take
		ds.remove(ds.size()-1);
		sum-=nums[i];
		subset_with_sum_K(i+1, nums,ans, ds, k, sum);
	}
	
/***Print any one subsequences with sum k***/
	
	static boolean subset_with_1sum_K(int i , int nums[], List<Integer>ds, int k, int sum) {
		
		//-->Base Case
		if(i==nums.length) {
			if(sum==k) {
				System.out.println(ds);
				return true;
			}
			return false;
		}
		
		//-->Take
		ds.add(nums[i]);
		sum+=nums[i];
		
		if(subset_with_1sum_K(i+1, nums, ds, k, sum))return true;
		
		
		//-->Not Take
		ds.remove(ds.size()-1);
		sum-=nums[i];
		if(subset_with_1sum_K(i+1, nums, ds, k, sum))return true;
		
		return false;
	}

	/***Count subsequences with sum k***/
	public static int subsetCount_with_sum_K (int i, int nums[] , int k, int sum) {
		
		//-->Base Case
		if(i==nums.length) {
			if(sum == k) {
				return 1;

			}
			return 0;
		}
		
		//--> Take

		sum+=nums[i];
		int l = subsetCount_with_sum_K(i+1, nums,  k, sum);
		
		//-->Not Take

		sum-=nums[i];
		int r = subsetCount_with_sum_K(i+1, nums,  k, sum);
		
		return l+r;
	}
}
