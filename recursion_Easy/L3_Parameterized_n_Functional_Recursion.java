package recursion_Easy;

import helpersFunction.ArrayHelper;


public class L3_Parameterized_n_Functional_Recursion {

	public static void main(String[] args) {
		sum(4,0);
		factorial(4,1);
		
		//--------------------
		
		int a = sum(4);
		int b = factorial(4);
		
		System.out.println(a);
		
		System.out.println(b);
		
		//-----------------
		reverseArr(new int[] {1,2,3,4,5},0,4);
		
		System.out.println();
		
		System.out.println(isPalindrome("abaaba",0));
		
		
	}
	
	//-->Parameterized
	
	//1. Sum of First N numbers
	
	static void sum(int i, int s) {
		
		if(i<1) {
			System.out.println(s);
			return;
		}
		
		sum(i-1, s+i);
	}
	
	//2. Factorial
	
	static void factorial(int i, int f) {
		
		if(i<1) {
			System.out.println(f);
			return;
		}
		
		factorial(i-1, f*i);
	}
	
	
	//-->Functional
	
	//1. Sum of First N numbers
	static int sum(int i) {
		
		if(i==0)return 0;
		
		return i+sum(i-1);
		
	}
	
	//2. Factorial
	static int factorial(int i) {
		if(i==1)return 1;
		
		return i*factorial(i-1);
	}
	
	
	/*********************----------------------------------*/
	
	//Reverse an array
	static void reverseArr(int arr[] , int i, int j) {
		
		
		
		if(i>j) {
			ArrayHelper.printArr(arr);
			return;
		}
		
		ArrayHelper.swap(arr, i,j);
		
		reverseArr(arr, i+1, j-1);
		
		
	}
	
	//isPalindrome
	
	static boolean isPalindrome(String s, int i) {
		
		if(i>= s.length()/2)return true;
		
		if(s.charAt(i) != s.charAt(s.length()-i-1));
		
		return isPalindrome(s,i+1);
		
	}
	
	

}
