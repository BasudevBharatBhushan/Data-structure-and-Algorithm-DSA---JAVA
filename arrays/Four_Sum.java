package arrays;
import java.util.*;
public class Four_Sum {

	public static void main(String[] args) {
//		List<List<Integer>> list = new ArrayList<>();
//		list = fourSum(new int[] {2 , 2, 2, 2, 1, 0, 3, 4}, 8);
//		
//		System.out.println(list);
		
		System.out.println(Integer.MAX_VALUE);
		
		int target = 1000000000;
		
		System.out.println(target);
		

	}
	//Basic Approach - Sort->3 pointers -> Binary Search (N^3 log n + n log n)
	
    //Optimal Approach   
	public static List<List<Integer>> fourSum(int[] num, int target) {
ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if (num == null || num.length == 0)
            return res;
        
        int n = num.length;
    
        Arrays.sort(num); 
    
        for (int i = 0; i < n; i++) {
        
            long target_3 = target - num[i];
        
            for (int j = i + 1; j < n; j++) {
            
                long target_2 = target_3 - num[j];
            
                int front = j + 1;
                int back = n - 1;
            
                while(front < back) {
                
                    long two_sum = num[front] + num[back];
                
                    if (two_sum < target_2) front++;
                
                    else if (two_sum > target_2) back--;
                
                    else {
                    
                        List<Integer> quad = new ArrayList<>(); 
                        quad.add(num[i]);
                        quad.add(num[j]);
                        quad.add(num[front]);
                        quad.add(num[back]);
                        res.add(quad);
                    
                        // Processing the duplicates of number 3
                        while (front < back && num[front] == quad.get(2)) ++front;
                    
                        // Processing the duplicates of number 4
                        while (front < back && num[back] == quad.get(3)) --back;
                
                    }
                }
                
                // Processing the duplicates of number 2
                while(j + 1 < n && num[j + 1] == num[j]) ++j;
            }
        
            // Processing the duplicates of number 1
            while (i + 1 < n && num[i + 1] == num[i]) ++i;
        
        }
        
    
        return res;
		

    }

}
