package bits;

public class Only_NonRepeating_Elements_WhereEveryElementRepeats_K_times {

	public static void main(String[] args) {
		
		System.out.println(findUnique(new int[] {2 , 2, 1 , 5, 1, 1, 2}, 7, 3));

	}
	
	static int findUnique(int a[] , int n , int k) {
		
		byte sizeof_int = 4;
		int INT_SIZE = 8*sizeof_int;
		
		int count[] = new int[INT_SIZE];
		
		
		for(int i = 0 ; i<INT_SIZE ; i++) {
			
			//This array is checking whether the ith bit containing 1
			for(int j = 0; j<n ; j++) {
				if((a[j] & (1<<i)) != 0) {    // 1<<i ---> bit masking
					count[i] += 1;
				}
			}
		}
		
		int res = 0;
		for(int i = 0; i< INT_SIZE ; i++) {
			res += (count[i] %k) *(1<<i);
		}
		
//		res = res / (n % k);
		
		return res;
	}

}
