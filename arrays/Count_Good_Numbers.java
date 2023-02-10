package arrays;
import java.util.*;
public class Count_Good_Numbers {
	/*
	 * The majority element is the element that appears more than ⌊n / 2⌋ times. 
	 * You may assume that the majority element always exists in the array.
	 */

	public static void main(String[] args) {
		System.out.println(majorityELement(new int[] {2, 2, 1, 1, 1, 2, 2}));
	}
	
	//Using Hashmap
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int leastMajorityCount = nums.length/2 + (nums.length %2);

        for(int e:nums){
            if(map.containsKey(e)){
                map.put(e, map.get(e)+1);
                if(map.get(e) >= leastMajorityCount)return e;
            }else{
                map.put(e, 1);
            }
        }
        return 0;
    }
    
    //LInear Approach
    
    public static int majorityELement(int []nums) {
    	int count = 0, flag = 0;
    	
    	for(int e:nums) {
    		if(count==0)flag = e;
    		
    		count = (e==flag? count+1:count-1);
    	}
    	
    	return flag;
    }
}
