package arrays;

public class Find_The_RepeatingNMissing_Number {

	public static void main(String[] args) {
		int array[] = {3,1,2,5,3};
		
		find_RepeatingNMissing_Number(array);

	}
	
	static void find_RepeatingNMissing_Number(int arr[]){
		int n = arr.length;
	//Find the sum of 1toN
		int p = (n*(n+1))/2;
		
	// Find sum of squared value of 1 to N
		int s = ((n)*(n+1)*((2*n)+1))/6;
		
		//Find sum and square sum of given arr
		int pp = 0 , ss = 0;
		for(int e:arr) {
			pp+=e;
			ss+=(e*e);
		}
		
//		int X_Y = p-pp; //(X-Y)
//		int res_s= s-ss; //(X-Y)(X+Y)
//		int XplusY = res_s/X_Y;
//		
//		int X = (X_Y+XplusY)/2;
//		int Y = XplusY-X;
		
		int X = ((p-pp)+((s-ss)/(p-pp)))/2;
		int Y = X-(p-pp);
		
		System.out.println("Missing Number "+X+ " Repeated Number " + Y);
		
		
	}

}
