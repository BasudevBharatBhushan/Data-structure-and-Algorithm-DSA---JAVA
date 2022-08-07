package bits;

public class Missing_N_Repeating {

	public static void main(String[] args) {
		
		missing_and_Repeating(new int[] {4 , 1, 2 , 5 , 4}, 5);
	}
	
	static void missing_and_Repeating(int arr[] , int n) {
		
		int res = 0;
		for(int e:arr) {
			res = res^e;
		}
		
		for(int i = 1 ; i<=n ; i++) {
			res = res^i;
		}
		
		// res & -res ---> it will give us the res containing only rightmost set bit (i.e 1)
		
		 res = res & (-res);
		
		int res1 = 0, res2 = 0;
		
		for(int e:arr) {
			if((e & res) >0 )res1 = (res1^e);
			else res2 = (res2^e);
		}
		
		for(int i = 1 ; i<=n; i++) {
			if((i & res) >0 )res1 = (res1^i);
			else res2 = (res2^i);
		}
		
		
		for(int e:arr) {
			if(res1==e) {
				System.out.println("Missing =  "+res2+", Repeating = "+res1);
				return;
			}
				
		}
		
		System.out.println("Missing =  "+res1+", Repeating = "+res2);
	}

}
