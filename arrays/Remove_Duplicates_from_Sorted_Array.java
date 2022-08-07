package arrays;

public class Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		
		int nums[]= {0,0,1,1,1,2,2,3,3,4};
		
		int arr[] = removeDuplicates(nums);
		
		for(int e:arr) {
			System.out.print(e+" ");
		}

	}
	
    public static int[] removeDuplicates(int[] arr) {
        
    	int i = 0;
    	int n = arr.length;
    	
    	for(int j = 1; j<n ; j++) {
    		if(arr[i] != arr[j]) {
    			i++;
    			arr[i]=arr[j];
    		}
    	}
    	
        return arr;
    }

}
