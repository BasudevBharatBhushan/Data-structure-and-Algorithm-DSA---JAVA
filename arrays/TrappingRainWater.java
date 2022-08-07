package arrays;

//PreProcessing of Array
public class TrappingRainWater {

	public static void main(String[] args) {
		
//		int arr[] = {4,2,0,3,2,5};
		
//		int arr[] = {5, 4, 9, 2, 5};
		
		int arr[] = {3, 1, 2 , 4, 0 , 1 , 3, 2};
//		
		System.out.println(trap(arr));
		
//		System.out.println(trap(new int[] {1,0,2,1,0,1,3,2,1,2,1}));
	}
	
    public static int trap(int[] height) {
    	
    	int n = height.length;
        
        int leftMax[] = new int [n];
        int rightMax[] = new int [n];
        
        int max = Integer.MIN_VALUE;
        int res = 0;
    
        for(int i = 0; i < n ; i++){
            max = Math.max(max, height[i]);
            leftMax[i]=max;
        }
        
        max = Integer.MIN_VALUE;
        
        for(int i = n-1; i >= 0 ; i--){
            max = Math.max(max, height[i]);
            rightMax[i]=max;
        }
        
        for(int e:rightMax)System.out.print(e+" ");
        
        for(int i = 0 ; i<n ; i++){
           res += (Math.min(leftMax[i] , rightMax[i]) - height[i]);
         
        }
        
        return res;
    		
    	
    }
    
    public int trap2(int[] height) {
        //Optimal Solution - 2 pointer Approach
        
        int n = height.length; 
        
        int l = 0;
        int r = n-1;
        
        int leftMax = 0, rightMax = 0;
        
        int res = 0;
        
        while(l<=r){
            if(height[l]<=height[r]){
                if(height[l]>=leftMax)
                    leftMax = height[l];
                else
                    res += (leftMax - height[l]);
                
                l++;
            }else{
                if(height[r]>=rightMax)
                    rightMax = height[r];
                else
                    res+= (rightMax - height[r]);
                
                r--;
            }
            
        }
        
        return res;
        
    }

}
