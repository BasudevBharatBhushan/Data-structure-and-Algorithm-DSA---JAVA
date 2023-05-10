package dynamic_Programming;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		int cost[] = {10, 15, 20};
		int dp[] = new int[cost.length+1];
		Arrays.fill(dp,-1);
		
		System.out.println(minCostClimbingStairs(cost, cost.length));
		
		System.out.println(minCostClimbingStairs_memoization(cost, cost.length, dp));
		
		System.out.println(minCostClimbingtairs_tabular(cost, cost.length, dp));
		
		System.out.println(minCostClimbingtairs_tabular_optimised(cost, cost.length));
	}
	
	//Recursive Approach
	public static int minCostClimbingStairs(int[] cost, int n) {
        
		if(n<0)return 0;
		
        if(n==0 || n==1)return cost[n];
        
        if(n == cost.length) return Math.min(minCostClimbingStairs(cost, n-1), minCostClimbingStairs(cost, n-2));
 
        return cost[n]+Math.min(minCostClimbingStairs(cost, n-1), minCostClimbingStairs(cost, n-2));
    }
	
	//Memoization
	public static int minCostClimbingStairs_memoization(int [] cost, int n , int dp[]) {
		if (n<0)return 0;
		
		if(n==0 || n==1)return cost[n];
		
		if(dp[n]!= -1)return dp[n];
		
		if(n == cost.length) {
			dp[n] = Math.min(minCostClimbingStairs(cost, n-1), minCostClimbingStairs(cost, n-2));
			return dp[n];
		}
		
		return dp[n] = cost[n] + Math.min(minCostClimbingStairs(cost, n-1), minCostClimbingStairs(cost, n-2));
	}
	
	//Tabulation
	public static int minCostClimbingtairs_tabular(int [] cost , int n , int dp[]) {
		
		dp[0] = cost[0];
		dp[1] = cost[1];
		
		for(int i = 2; i < n ; i++) {
			dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
		}
		
		return Math.min(dp[n-1], dp[n-2]);
	}
	
	//Optimized Tabulation
	public static int minCostClimbingtairs_tabular_optimised(int [] cost , int n ) {
		
		int prev2 = cost[0];
		int prev1 = cost[1];
		
		for(int i = 2; i < n ; i++) {
			int curr = cost[i] + Math.min(prev2, prev1);
			prev2 = prev1;
			prev1 = curr;
		}
		
		return Math.min(prev2, prev1);
		
	}	
	

}
