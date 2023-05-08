package recursion_Medium;

import java.util.ArrayList;
import java.util.List;
/*
 * No duplicates allowed
 */
public class Combination_Sum_III {

	public static void main(String[] args) {
		
		System.out.println(combinationSum3(3, 9));
		
	}
	public static List<List<Integer>> combinationSum3(int k, int n) {
		
		
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer>ds = new ArrayList<>();

		combinationSum3(1, ans, ds,k, n);

		return ans;
	}

	private static void combinationSum3(int i, List<List<Integer>>ans, List<Integer> ds,int windowSize, int target) {

		//--> Base Case 1
		if(ds.size()==windowSize) {
			if(target==0) {
				ans.add(new ArrayList<Integer>(ds));
				return;
			}
		}
		


		for(int j = i; j<10; j++) {
			//if you want to allow duplicates then just use j= 1

			if(j>target)break;

			ds.add(j);
			
			combinationSum3(j+1,  ans, ds, windowSize,target-j);

			ds.remove(ds.size()-1);
		}
	}


}
