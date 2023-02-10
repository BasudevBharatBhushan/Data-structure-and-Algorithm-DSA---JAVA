package divide_N_Conquer;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
		System.out.println(binarySearch(arr, 0, arr.length, 50));
		
		
		int arr2[][]= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		
		binarySearch(arr2[0], 0, arr.length, 5);
		
	}
	
	public static int binarySearch(int arr[], int first, int last, int key){  
		
		   int mid = (first + last)/2;  
		   
		   while( first <= last ){  
			   
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		        
		      }else if ( arr[mid] == key ){  
		        return mid;
		        
		      }else{  
		         last = mid - 1;  
		      }  
		      
		      mid = (first + last)/2;  
		   }  
		   return -1; 
	}  
	
	

}
