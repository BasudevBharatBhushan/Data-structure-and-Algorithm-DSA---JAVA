package recursion_Medium;

import java.util.ArrayList;
import java.util.List;
/*
 * Return sum of all the subsequences/subsets
 */

public class Subsets_I {

	public static void main(String[] args) {
		
//		int nums[]= {3, 1, 2};
		int nums[] = {1, 2, 2, 3 , 3};
		List<Integer> sums = new ArrayList<>();
		
		subsetSums1(0, nums, 0, sums);
		
		System.out.println(sums);
	}
	
	public static void subsetSums1(int i , int nums[],int sum,  List<Integer> sums ) {
		//-->Base Case
		if(i==nums.length) {
			 sums.add(sum);
			 return;
		}
		
		//Pick
		sum+=nums[i];
		subsetSums1(i+1, nums, sum, sums);
		
		//Not Pick
		sum-=nums[i];
		subsetSums1(i+1, nums, sum, sums);
		
	}

}
