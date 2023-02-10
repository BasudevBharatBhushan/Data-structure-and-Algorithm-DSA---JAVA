package arrays;

public class RotateArray {

	public static void main(String[] args) {
		//Test Cases - 1234567 , k = 3
		//Output - 5671234

	}
	   public void rotate(int[] nums, int k) {
	        
	        int n = nums.length;
	        k=k%n;

	        //Reverse 0-> n-k-1
	        reverse(nums, 0, n-k-1);


	        //Reverse n-k -> n-1
	        reverse(nums, n-k, n-1);


	        //Reverse the whole array
	        reverse(nums, 0, n-1);


	    }

	    private static void swap(int arr[] , int a , int b){
	        int temp = arr[a];
	        arr[a] = arr[b];
	        arr[b]=temp;
	    }

	    private static void reverse(int arr[] , int i, int j){
	        while(i<j){
	            swap(arr, i,j);
	            i++;
	            j--;
	        }
	    }


}
