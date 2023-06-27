package sorting_algorithms;
import helpersFunction.ArrayHelper;

public class Quick_Sort {

	public static void main(String[] args) {
		int arr[] = {10, 7, 8, 9, 1, 5};
		int n = arr.length;
		
		quick_sort(arr, 0, n-1);
		
		ArrayHelper.printArr(arr);
	}
	/*
	 * Pick a pivot and place it in its correct place in the sorted array
	 */
	private static int partition(int arr[] , int low , int high) {
		int pivot = arr[high];
		int i = low-1;

		for(int j = low; j<high; j++) {
			if(arr[j] <= pivot) {
				i++;
				ArrayHelper.swap(arr, i, j);
			}

		}
		ArrayHelper.swap(arr, i+1, high);
		return i+1;
	}
	public static void quick_sort(int arr[] , int low , int high) {
		if(low<high) {
			int pivot = partition(arr, low, high);

			quick_sort(arr, low, pivot-1);
			quick_sort(arr, pivot+1, high);
		}
	}




}
