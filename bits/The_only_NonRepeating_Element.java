package bits;

public class The_only_NonRepeating_Element {

	public static void main(String[] args) {
		
		int arr[]= {5 , 4, 1 , 4 , 3 , 5 , 1};
		
		System.out.println(findSingle(arr, arr.length));

	}
	
	public static int findSingle(int arr[] , int n) {
		
		int res = 0;
		
		for(int e:arr) {
			res = res^e;
		}
		
		return res;
	}
	
	

}
