package recursion_Easy;

public class Pow {
	public static void main(String args[]) {
		double x = myPow(2, 7);
		
		System.out.println(x);
	}
	public static double myPow(double x , int n) {
		if(n == Integer.MIN_VALUE){
	          if(x > 1)return 0;
	          else return 1;
	     }
		if(n < 0)return 1/myPowR(x, -n);
		return myPowR(x,n);
	}
	
	public static double myPowR(double x, int n) {
		System.out.println(x+" "+n);
        //BaseCase
        if(n==0)return 1;

        //Recursive Function
        if((n & 1)==0){
            double res = myPow(x, n>>1);
            return res*res;
        }else{
            return x * myPow(x, n-1);
        }
    }
}
