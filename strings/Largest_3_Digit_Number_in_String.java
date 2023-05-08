package strings;

public class Largest_3_Digit_Number_in_String {

	public static void main(String[] args) {
		
		/*
		 * Testcases
		 * num = "6777133339"  , output - 777
		 * num = "2300019" , output - 000
		 * num = "42352338" , output - ""
		 */

	}
	public static String largestGoodInteger(String num) {

		int n = num.length();
		int maxThreeDigit = Integer.MIN_VALUE;
		int flag = 0;

		for(int i = 1; i<n; i++){

			if(num.charAt(i)==num.charAt(i-1)){
				flag++;
			}else{
				flag=0;
			}
			if(flag == 2){
				maxThreeDigit = Math.max(maxThreeDigit, Integer.parseInt(num.substring(i-2, i+1)));
			}


			// maxThreeDigit = Math.max(maxThreeDigit, Integer.parseInt(num.substring(i, i+4)));
		}

		if(maxThreeDigit == Integer.MIN_VALUE){
			return "";
		}

		return (maxThreeDigit !=0 ?Integer.toString(maxThreeDigit):"000");


	}

}
