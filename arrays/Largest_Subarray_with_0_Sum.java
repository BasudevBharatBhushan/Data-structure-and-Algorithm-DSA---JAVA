package arrays;
import java.util.*;
public class Largest_Subarray_with_0_Sum {

	public static void main(String[] args) {
		
		int a[] = {2 , 4 , -2 , 1 , -3 , 5};
		
		System.out.println(maxLen(a , a.length));

	}
	
	static int maxLen(int arr[], int n){
		Map<Integer, Integer> map = new HashMap<>();
		
		int sum = 0;
		
		int sub_arrayLength = 0;
		int Longest_sub_arrayLength = 0;
		
		for(int i = 0; i<n ; i++) {
			map.put(sum, i);
			sum+=arr[i];;
			
			if(map.containsKey(sum)) {
				int x = map.get(sum);
				
				sub_arrayLength = (i-x)+1;
				
			}
			Longest_sub_arrayLength= Math.max(sub_arrayLength, Longest_sub_arrayLength);
			
		}
       return Longest_sub_arrayLength;
    }

}
