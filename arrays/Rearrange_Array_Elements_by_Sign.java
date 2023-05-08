package arrays;
import helpersFunction.ArrayHelper;
public class Rearrange_Array_Elements_by_Sign {

	public static void main(String[] args) {
		System.out.println(rearrangeArray(new int[] {3, 1, -2, -5, 2, -4}));
	}
	public static void divideArray(int[]nums) {
		int n = nums.length;
		int i = 0;
		int j = n/2;
		
		//First divide the array into positive and negative
		//By this method, the array can be divided into positive and negative halves but order of negative halves coulnot be maintained
		while(i<n/2) {
			if(nums[i]<0) {
				
				while(j<n && nums[j]<0)j++;
				
				ArrayHelper.swap(nums, i, j);
			}else {
				i++;
			}
		}
		
		for(int e:nums) {
			System.out.print(e+" ");
		}
	}
	
	public static int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int j=0,k=1;
        for(int i:nums)
        {
           if(i>0)
           {
               ans[j]=i;
               j=j+2;
           }
            else
            {
                ans[k]=i;
                k=k+2;
            }
        }
        return ans;
    }

}
