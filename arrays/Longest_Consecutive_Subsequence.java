package arrays;
import java.util.*;
public class Longest_Consecutive_Subsequence {

	public static void main(String[] args) {
		
		//System.out.println(longestConsecutive(new int[] {1 , 2, 3, 6 , 9, 10, 11, 12, 13}));
		System.out.println(longestConsecutive(new int[] {9,1,-3,2,4,8,3,-1,6,-2,-4,7}));

	}
	static int longestConsecutive(int[] nums) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int e:nums) {
			set.add(e);
		}
		
		int count = 1;
		int max_count = 0;
		for(int e:set) {
			if(set.contains(e-1)) {
				continue;
			}else {
				for(int i = 1; ;i++) {
					if(set.contains(e+i)) {
						count++;
					}else {
						max_count= Math.max(count, max_count);
						count=1;
						break;
					}
				}
			}
			
		}
		
        return max_count;
    }

}


//[9,1,-3,2,4,8,3,-1,6,-2,-4,7]  - ans 4