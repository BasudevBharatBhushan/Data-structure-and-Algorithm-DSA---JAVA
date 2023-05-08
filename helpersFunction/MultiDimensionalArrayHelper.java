package helpersFunction;

import java.util.Arrays;

public class MultiDimensionalArrayHelper {

	public static void main(String[] args) {
		
	}
	
	public static void print2DArray(int arr[][]) {
		for(int[]row:arr) {
			for(int x:row) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
	
	public static void sortColumnWise(int arr[][]) {
		Arrays.sort(arr, (a,b)->a[0]-b[0]);
	}

}
