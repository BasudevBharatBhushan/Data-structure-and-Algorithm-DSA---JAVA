package dynamic_Programming;

import java.util.Arrays;

public class Climbing_Stairs {

	public static void main(String[] args) {
		System.out.println(climibing_stairs(3));
		
		int n = 3;
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(climbing_stairs_memoization(n, dp));
		
		System.out.println(climbing_stairs_tabular(n, dp));
		
		System.out.println(climbing_stairs_tabular_optimised(n));
	}
	
	//How to understand if it is a DP problem
	/* [Try all possible Way]
	 * 
	- Count the total no. of ways
	- Min / Max Output (There are multiple ways to do it)
	
	*/
	
	/*
	 * SHORTCUT TRICK
	 * 
	 * 1. Try to represent the problem in terms of index
	 * 2. Do all possible stuffs on that index according to the problem statement
	 * 3. 
	 * - Sum of All Stuffs - Count all ways
	 * - Min(of all stuffs) - Find Min
	 * - Max(of all stuffs) - Find Max
	 * 
	 */
	
	//Recursion
	public static int climibing_stairs(int n) {
		if(n==0 || n==1)return 1;
		
		int a = climibing_stairs(n-1);
		int b = climibing_stairs(n-2);
		
		return a+b;
	}
	
	//Memoizaton
	public static int climbing_stairs_memoization(int n , int dp[]) {
		
		if(n==0 || n==1)return 1;
		
		if(dp[n]!=-1)return dp[n];
		
		int a = climibing_stairs(n-1);
		int b = climibing_stairs(n-2);
		
		return dp[n] = (a+b);
		
	}
	
	
	//Tabulation
	public static int climbing_stairs_tabular(int n , int []dp) {
		dp[0]=1;
		dp[1]=1;
		
		for(int i = 2; i<=n ; i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[dp.length-1];
	}
	
	//Optimized Tabulation
	public static int climbing_stairs_tabular_optimised(int n ) {
		int prev2 = 1;
		int prev1 = 1;
		
		for(int i = 2 ; i<=n ; i++) {
			int curr = prev1 + prev2;
			prev2 = prev1;
			prev1 = curr;
		}
		
		return prev1;
	}
	
}
