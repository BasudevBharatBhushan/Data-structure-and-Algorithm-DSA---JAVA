package recursion_Medium;
import java.util.*;
public class Return_All_Subsequences {

	public static void main(String[] args) {
		
		int nums[]= {3, 1, 2};
		System.out.println(subsets(nums));
	}
	
	public static List<List<Integer>> subsets (int []nums){
		
		List<List<Integer>> subsetList = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		subsets(0 , nums, subsetList, list);
		
		return subsetList;
	}
	
	private static void subsets(int i , int[]nums, List<List<Integer>>subsetList, List<Integer>list ){

		//--> Base Case
		if(i == nums.length) {
			subsetList.add(new ArrayList<Integer> (list));
			return;
		}
		
		//--> Take
		list.add(nums[i]);
		subsets(i+1, nums, subsetList, list);
		
		
		//--> Not Take
		list.remove(list.size()-1);
		subsets(i+1, nums, subsetList, list);
		
	}

}
