package recursion_Easy;

public class Count_Good_Numbers {
static long mod = (int)1e9+7;
	public static void main(String[] args) {
		System.out.println(mod);
		
		int x = countGoodNumbers(4);
		System.out.println(x);
	}
	
	public static int countGoodNumbers(long n) {
		long oddPlaces = n/2;
		long evenPlaces = (n/2) + (n%2);
		
		/*
		 * Possible digits in even places - 0, 2, 4, 6, 8 ---total 5
		 * Possible digits in odd places - 2, 3, 5, 7 ---total 4
		 */
		
		return (int) ((pow(5, evenPlaces) * pow(4, oddPlaces)%mod));
	}
	
	public static long pow(int a , long n) {
		if(n==0)return 1;
		if(n==1)return a;
		
		if((n&1)!=0) { //Odd
			return (a*pow(a, n-1))%mod;
		}
		long half = pow(a, n/2);
		return half * half % mod;
	}

}
