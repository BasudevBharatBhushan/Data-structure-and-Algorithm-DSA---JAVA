package arrays;

public class Next_Permutation {

	public static void main(String[] args) {
		
//		int arr[]= { 1 , 3 , 5 , 4, 2};
		// its next permutation will be 
		    /*
		     * Step 1: Swap 3 & 4  --- 1 4 5 3 2
		     * Step 2: Reverse 5 , 4, 2 --------1 4 2 3 5
		     */
		int arr[]= { 1 ,1};
		
		nextPermutation(arr);
		
//		for(int e:arr) {
//			System.out.print(e+" ");
//		}
	}
	
	public static void nextPermutation(int[] nums) {
		
		int n = nums.length;
		
		int i = n-2;
		
		while(i >=0 && nums[i]>=nums[i+1])i--;
		
		System.out.println(i);
		if(i>=0) {
			int j = n-1;
			while( nums[j]<=nums[i])j--;
			swap( nums , i , j);
		}
//		
//		
//		i++;
//		reverse(nums , i , n-1);
//		
		
	}
	
	static void swap(int arr[] , int a , int b ) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	static void reverse( int arr[] , int i , int j) {
		while(i<j) {
			swap(arr, i , j);
			i++ ; j--;
		}
	}

}
