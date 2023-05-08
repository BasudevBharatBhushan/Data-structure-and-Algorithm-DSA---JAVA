package binary_search;

public class Search_Range {
	public static void main(String args[]) {
		int nums[] = {5,7,7,8,8,10};
		
		int target = 8;
		
		int result [] = searchRange(nums, target);
		
		for( int e:result ) {
			System.out.print(e+" ");
		}
	}
	public static int[] searchRange(int nums[] , int target) {

		int lo = 0, hi = nums.length-1;

		if(lo == hi && target == nums[lo])return new int[] {0,0};

		while(lo<hi) {
			if (target != nums[lo] && (nums[lo]<target))lo++;
			if(target != nums[hi] && (nums[hi] > target))hi--;

			if(target == nums[0] && target == nums[hi])return new int[] {lo, hi};
		}

		return new int[] {-1, 1};
	}
}
