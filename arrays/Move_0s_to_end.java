package arrays;

//Link - https://leetcode.com/problems/move-zeroes/description/

import helpersFunction.ArrayHelper;

public class Move_0s_to_end {

	public static void main(String[] args) {
		
		int arr[] = {0,1,0,3,1,2};
		
		moveZeros(arr);
		
		ArrayHelper.printArr(arr);
		
	}
	
	public static void moveZeros(int []nums) {
		int i = 0; //Point to track zero element
		int x = 0; //Pointer to track non-zero element
		
		int n = nums.length;
		
		//Find the first occurrence of zero
		while(i<n) {
			if(nums[i]==0)break;
			i++;
		}
		
		x=i+1;
		
		while(i<n && x<n) {
			if(nums[x]!=0) {
				ArrayHelper.swap(nums, i, x);
				i++;
			}
			
			x++;
		}
		
	}

}
