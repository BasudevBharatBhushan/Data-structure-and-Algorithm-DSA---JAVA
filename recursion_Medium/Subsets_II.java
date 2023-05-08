package recursion_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * Returning all the sequences without duplicates
 */
public class Subsets_II {

	public static void main(String[] args) {
		
		System.out.println(subsetsWithDup(new int[] {1, 2, 2, 3 , 3}));
		System.out.println(Return_All_Subsequences.subsets(new int[] {1, 2, 2, 3 , 3}).size());
		
	}
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> ds = new ArrayList<>();
    int ind = 0;
    
    func(ind, nums, ans, ds);
    // ans.remove(ans.size()-1);
    
    return ans;
}

private static void func( int ind ,int arr[] , List<List<Integer>> ans , List<Integer>ds) {
	
    
	ans.add(new ArrayList<>(ds));
	
	for(int i = ind ; i < arr.length ; i++) {
		if(i != ind && arr[i]==arr[i-1])continue;
		
		ds.add(arr[i]);
		
		func(i+1, arr, ans, ds);
		
		ds.remove(ds.size()-1);
	}
}
	

}
