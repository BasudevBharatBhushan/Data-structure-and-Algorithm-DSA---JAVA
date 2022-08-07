package rough;

public class Bits {
	public static void main(String args[]) {
	
		int a = 5;
		
//		System.out.println(1<<3);
		
		int arr[]= {1 , 3, 4};
		
		int res = 0;
		
		int k = 3;
		
		for(int i = 0 ; i< arr.length ; i++) {
			
			System.out.print((arr[i]%k) +" "+ (1<<i));
			System.out.println();
			
			res+=(arr[i]%k) * (1<<i);
		}
		
		res = (res/(7%3));
		
//		System.out.println(res);
		
	}
	
	
}
