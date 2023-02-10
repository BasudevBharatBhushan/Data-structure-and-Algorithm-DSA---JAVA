package rough;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CodeTest {

	public static void main(String[] args) throws Exception {

		int a = 9, b = 7, c = 7;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		String nd[] = reader.readLine().trim().split(" ");
		
		int n = Integer.parseInt(nd[0].trim());
		int k = Integer.parseInt(nd[1].trim());
		
		
		String nums[] = reader.readLine().trim().split(" ");
		
		int arr[] = new int[n];
		
		for(int i =0;  i<n  ;i++) {
			arr[i]=Integer.parseInt(nums[i].trim());
		}
		
		
		
		
//		System.out.println(a+b+c);
		
//		System.out.println(fun(2, 5));
//		int arr[] = {1,2,3,4};
//		System.out.println(fun(arr, 4,3));
	}
	
	static int fun(int arr[], int n , int k) {
		
		int max = Integer.MIN_VALUE;
		int flag = 0;
		
		for(int i = 0; i< n ; i++) {
			if(arr[i] > max) {
				max = arr[i];
				flag = i;
			}
		}
		
		for(int i = 0; i< n; i++) {
			if(i!=flag && arr[i]*k > max) {
				return -1;
			}
		}
		return flag;
		
	}
	


}
