package dynamic_Programming;
import java.util.Arrays;

public class Fibonacci_Number {

	public static void main(String[] args) {
		int x = 4;
		
		System.out.println(fibonacci_recusion(x));
		
		int dp[] = new int[x+1];
		
		Arrays.fill(dp, -1);
		
		System.out.println(fibonacci_memoization(x, dp));
		
		System.out.println(fibonacci_tabular(x, dp));
		
		System.out.println(fibonacci_tabular_optimised(x));
		System.out.println(fibonacci_tabular_optimised(x));
	}
	
	//Recursive Approach || [Exponential Time Complexity]  || Overlapping Subproblems || TC -> O(2^n) || SC -> O(N)(Recursion Stack Space)
	public static int fibonacci_recusion(int i) {
		//Base Case
		if (i<=1)return i;
		
		return fibonacci_recusion(i-1)+fibonacci_recusion(i-2);
	}
	
	
	//Memorization || (Top Down) || [Linear Time Complexity] || TC -> O(N) || SC -> O(N) (Recursion Stack Space) + O(N) (Array)
	public static int fibonacci_memoization(int i , int[]dp) {
		//Base Case
		if (i<=1)return i;
		
		if (dp[i]!=-1)return dp[i];
		
		return dp[i]=(fibonacci_memoization(i-1, dp) + fibonacci_memoization(i-2, dp)) ;
		
	}
	
	//Tabulation || (Bottom Up) || [No Recursion Stack Space] || TC -> O(N) || SC -> O(N) 
	public static int fibonacci_tabular(int n, int []dp) {
		dp[0]=0;
		dp[1]=1;
		
		for(int i = 2; i <= n ; i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[dp.length-1];
	}
	
	
	//Optimized Tabulation || (No Linear Space) || TC -> O(N) || SC -> O(1)
	
	public static int fibonacci_tabular_optimised(int n) {
		int prev2 = 0;
		int prev1 = 1;
		
		for(int i = 2; i <=n ; i++) {
			int curr = prev1 + prev2;
			prev2 = prev1;
			prev1 = curr;
		}
		
		return prev1;
	}
	
	//Method2
	public static int fibonacci_tabular_optimised_method2(int n) {
		int prev2 = 0;
		int prev1 = 1;
		
		int sum = n==1?1:0;
		
		for(int i = 2; i <=n ; i++) {
			sum = prev1+prev2;
			
			prev2 = prev1;
			prev1 = sum;
		}
		
		return sum;
	}

}
