package helpersFunction;

public class ArrayHelper {

	public static void printArr(int arr[] ) {
		for(int e:arr) {
			System.out.print(e+" ");
		}
	}
	
	public static void printArr(String arr[] ) {
		for(String e:arr) {
			System.out.print(e+" ");
		}
	}
	
	public static void swap(int arr[] , int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void reverse(int arr[], int i, int j) {
		while(i<j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}

}
