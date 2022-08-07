package arrays_others;
//write an algorithm with O(log n) runtime complexity.
public class First_N_Last_Position_InSortedArray {

	public static void main(String[] args) {
		

	}
	
    public static int[] searchRange(int[] nums, int target) {
    	
    	int lo = 0, hi = nums.length-1; 
        
        if(lo == hi && target == nums[lo])return new int[]{0,0};
        
        while(lo<hi){
            
            if((target != nums[lo]) && (nums[lo]<target))lo++;
            if((target != nums[hi])&& (nums[hi]>target))hi--;
            
            if(target == nums[lo] && target ==nums[hi])return new int[] {lo , hi};
            
            
        }
        
        return new int[] {-1 , -1};
        
    }
    
    public static int[] searchRangeOptimised(int [] nums , int target) {   //Using Binary Search
    	
    	return new int[] {findFirst(nums, target), findLast(nums, target)};
    }
    
    private static int findFirst(int []nums , int target) {
		int idx = -1;
		int start = 0;
		int end = nums.length-1;
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(nums[mid]>=target) {
				end = mid-1;
			}else {
				start = mid+1;
			}
			
			if(nums[mid]==target)idx = mid;
		
		}
		return idx;
	}
	
	private static int findLast(int []nums , int target) {
		int idx = -1;
		int start = 0;
		int end = nums.length-1;
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(nums[mid]<=target) {
				start = mid+1;
			}else {
				end = mid-1;
			}
			
			if(nums[mid]==target)idx = mid;
		
		}
        return idx;
		
	}
    
}