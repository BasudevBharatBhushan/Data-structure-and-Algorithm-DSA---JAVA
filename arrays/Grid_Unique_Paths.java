package arrays;

import java.util.Arrays;
import java.util.List;

public class Grid_Unique_Paths {

	public static void main(String[] args) {
		System.out.println(uniquePaths3(3,7));

	}
	
	// Brute Force Approach - Recursive Method | Time & Space complexity - Exponential
	
	static int uniquepaths(int m , int n) {
		return countPath1(0 , 0 , m , n);
	}
	
	static int countPath1(int i , int j, int m, int n) {
		if(i==(n-1) && j==(m-1))return 1;
		if(i>=n|| j>=m)return 0;
		else return countPath1(i+1, j , m , n)+  countPath1(i , j+1, m , n);

	}
	
	
	//Dynamic Programming Approach - Avoid Sub-Overlapping Problem 
	//Complexity - O(m*n) both space and time
	
	static int uniquepaths2(int m , int n) {
		int [][] table = new int [m][n];
		Arrays.stream(table).forEach(a->Arrays.fill(a, -1));
		int num =  countPath2(0 , 0 , m , n, table);
		if(m==1 && n==1) {
			return num;
		}
		System.out.println(table[0][0]);
		return table[0][0];
		
	}
	
	static int countPath2(int i , int j, int m, int n, int [][] table) {
//		System.out.println(i+" " + j);
		if(i==(n-1) && j==(m-1))return 1;
		if(i>=n|| j>=m)return 0;
		if(table[i][j]!=-1) return table[i][j];
		else return table[i][j] = countPath2(i+1, j , m , n, table)+  countPath2(i , j+1, m , n, table);

	}
	

// Combinatorics Solution | Time Complexity - O(n-1) or O(m-1) | Space Complexity - O(1)
	//(m+n-2)C(m-1)
	
	static int uniquePaths3(int m , int n) {
		int N = n+m-2;
		int r = m-1;
		double res = 1;
		
		for(int i = 1 ; i<=r ; i++) {
			res = res*(N-r+i)/i;
		}
		
		return (int)res;
	}
	
	
}
