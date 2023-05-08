package divide_N_Conquer;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
		System.out.println(binarySearch(arr, 0, arr.length-1, 50));
		
		
		int arr2[][]= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		
		binarySearch(arr2[0], 0, arr.length-1, 5);
		
	}
	
	public static int binarySearch(int arr[], int i, int j, int key){  
		
		
		   int mid = i + (j-i)/2;

		   
		   while( i <= j ){  
			   
		      if ( arr[mid] < key ){  
		        i = mid + 1;     
		        
		      }else if ( arr[mid] == key ){  
		        return mid;
		        
		      }else{  
		         j = mid - 1;  
		      }  
		      
		      mid = i + (j-i)/2;

		   }  
		   return -1; 
	}  
	
	 private static int binary_search(int [] nums, int i, int j, int target){

	        if(j>=i){
	            int mid = i + (j-i)/2;
	            if (nums[mid] == target)return mid;

	            if(nums[mid] > target)
	                return binary_search(nums, i, mid-1, target);
	            return binary_search(nums, mid+1, j, target);
	        }
	        return -1;
	        
	       
	        
	    }
	
	

}
