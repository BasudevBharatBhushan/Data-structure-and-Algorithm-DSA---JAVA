package arrays_others;
//At most two duplicates can be present

public class Remove_Duplicates_SortedArray_II {

	public static void main(String[] args) {
		int arr[] = removeDuplicates(new int [] {0,0,1,1,1,1,2,3,3});
		
		for(int e:arr) {
			System.out.println(e);
		}

	}
	public static int[] removeDuplicates(int[] arr) {
	        
	    	int i = 0;
	    	int n = arr.length;
	    	
//	    	for(int e:arr) {
//	    		if(i==0 || i==1 || arr[i-2]!=e) {
//	    			arr[i]=e;
//	    			i+=1;
//	    		}
//	    	}
//	    	
	    	i = 0;
	    	
	    	for(int j = 2; j<n; j++) {
	    		if(arr[j]!=arr[i]) {
	    			arr[i+2]=arr[j];
	    			i++;
	    		}
	    	}
	    	
	        return arr;
	 }


}
