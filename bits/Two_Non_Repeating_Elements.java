package bits;

public class Two_Non_Repeating_Elements {

	public static void main(String[] args) {
		
		UniqueNumbers2(new int[] {5 , 4 , 1 , 4 , 3 , 5 , 1 , 2}, 8);

	}
	
	public static void UniqueNumbers2(int[] arr , int n) {
		
		int res = 0;
		for(int e:arr) {
			res = res^e;
		}
		
		// res & -res ---> it will give us the res containing only rightmost set bit (i.e 1)
		
		res = res & (-res);
		
		int res1 = 0, res2 = 0;
		
		for(int e:arr) {
			if((e & res) >0 )res1 = (res1^e);
			else res2 = (res2^e);
		}
		
		System.out.println("Two Non Repeating Numbers are "+ res1+ " and "+ res2);
		
		
	}

}
