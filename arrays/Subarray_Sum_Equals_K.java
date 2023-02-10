package arrays;
import java.util.*;
public class Subarray_Sum_Equals_K {

	public static void main(String[] args) {
		
		int nums[] = {1, 1, 1};
		
		System.out.println(subarraySumint(nums, 2));
		
	}
	public static int subarraySumint ( int []nums, int k) {
		
		Map<Integer, Integer> map = new HashMap<>();   //<Sum, Value>
		
		map.put(0, 1);
		
		int count = 0, sum = 0;
		
		for(int i = 0;  i < nums.length; i++) {
			sum+=nums[i];
			
			if(map.containsKey(sum-k))
				count += map.get(sum-k);
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		System.out.println(map);
		
		return count;
	}

}
