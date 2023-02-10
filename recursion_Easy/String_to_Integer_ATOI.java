package recursion_Easy;

import java.math.BigInteger;

/*
 * If there is other chars present first instead of number characters then simply return zero
 * 
 * chars accepted at starting are
 * <empty space>
 * - (minus) 
 */

public class String_to_Integer_ATOI {

	public static void main(String[] args) {



//		System.out.println(myAtoi("999999999"));
		
//		int x = 100000000*10;
//		int x = 999999999*10;
		
//		System.out.println(2147483640 + 8);  = -2147483648
		
//		System.out.println( (2147483640 - 8) >= 2147483640 );
		
		System.out.println(999999999 *10);



		/*
		 * Other test cases
		 * -45
		 * "   90"
		 * "--45" ---> 0
		 * "abc45"--->0
		 * "-2147483648"
		 * "2147483647"
		 * "+1"
		 * "-+12" ---->0
		 * "+"
		 * "-"
		 * "  0000000000012345678"  
		 * 2147483648
		 */

	}

	/*
	 * ASCII
	 * 0 - 48
	 * 9 - 57
	 * - (minus) - 45
	 * + (plus) - 43
	 * empty space - 32
	 */
	
	public static int myAtoi(String str) {
		int[] result = new int[] {0};
		atoi(str, 0, result, null);
		return result[0];
	}
	
	private static void atoi(String s, int i , int[]result, Boolean positive) {
		//Base Case 1: String Overflow
		if(i>s.length()-1)return;
		
		char ch = s.charAt(i);
		//Base Case 2: Check for Blank spaces
		if(ch==32) {
			if(positive !=null)return;  //If blank spaces present in between then return
			
			atoi(s, ++i, result, positive);
			
		}
		
		//Base Case 3: Check for sign
		if(ch==43) {
			if(positive !=null)return;
			
			atoi(s, ++i, result, Boolean.TRUE);
		}
		
		if(ch==45) {
			if(positive!=null)return;
			atoi(s, ++i, result, Boolean.FALSE);
		}
		
		
		//Check for Non-Digits
		if(ch<48 || ch>57) {
			return;
		}
		
		//If no sign is present, by default positive
		if(positive == null) {
			positive = Boolean.TRUE;
		}
		int x = result[0]*10;
		int y = (positive?1 :-1)*(ch-48);  //It is storing the digits. 48 is the ASCII code for zero
		
		/*
		 * What does x/10==result[0] means?  , The number is not of 10 digit yet.
		 * 
		 * eg.
		 * Integer.MAX_VALUE * 10 = -10
		 * Integer.MIN_VALUE * 10 = 0
		 * 
		 * Not only this, if we multiply any 10 digit number with 10, then upon dividing the result will never be the same
		 * eg2. 
		 * 1000000000 * 10 = 1410065408
			
		 * 
		 * So, if the result[0], was a 10 digit int value we can put this initial check to find out
		 * 
		 */
		
		/*
		 * Integer.MAX_VALUE -y >=x , if this condition is true, then the 10
		 * 
		 */
		
		/*
		 * Case 1
		 * let suppose x = 1280
		 * y = 6
		 * 
		 * Max Value - y > 1280 === true
		 * 
		 * ---------------------------------------
		 * 
		 * Case 2
		 * x = 2147483640
		 * y = 8
		 * 
		 * Max Value -y > 2147483640 === false
		 * 
		 * 
		 * ----------------------------------
		 * Case 3
		 * x = 2147483640
		 * y = 6
		 * 
		 * Max Value - y > 2147483640   == true
		 * 
		 */
		
		if (x/10==result[0] && ((positive && Integer.MAX_VALUE - y >= x) || (!positive && Integer.MIN_VALUE - y <= x))) {
			System.out.println(x+" "+y );
			result[0] = x + y;
			System.out.println(result[0]);
			atoi(s, ++i, result, positive);
		} else {
			result[0] = positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			return;
		}
	}

}
