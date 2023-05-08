package dynamic_Programming;
import java.util.Arrays;

public class Fibonacci_Number {

	public static void main(String[] args) {
		int x = 4;
		
		System.out.println(fibonacci_recusion(x));
		
		int dp[] = new int[x+1];
		
		Arrays.fill(dp, -1);
		
		System.out.println(fibonacci_memoization(x, dp));
		
	}
	
	//Recursive Approach || [Exponential Time Complexity]  || Overlapping Subproblems
	public static int fibonacci_recusion(int i) {
		//Base Case
		if (i<=1)return i;
		
		return fibonacci_recusion(i-1)+fibonacci_recusion(i-2);
	}
	
	
	//Memorization || (Top Down) || [Linear Time Complexity]
	public static int fibonacci_memoization(int i , int[]dp) {
		//Base Case
		if (i<=1)return i;
		
		if (dp[i]!=-1)return dp[i];
		
		return dp[i]=(fibonacci_memoization(i-1, dp) + fibonacci_memoization(i-2, dp)) ;
		
		
		
	}
	

}
