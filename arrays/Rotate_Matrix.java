package arrays;

import java.util.Arrays;

public class Rotate_Matrix {

	public static void main(String[] args) {
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
	
		rotate(matrix);
		
		printInMatrixStyle(matrix);
	}
	
	public static void rotate(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		//Find Transpose of the Matrix
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0; j<i ; j++) {
				swap(matrix , i , j);
			}
		}
		
		//Reverse the rows
		for(int i = 0 ; i < rows ; i++) {
			int a = 0 , b = cols-1;
			while(a<b) {
				int temp = matrix[i][a];
				matrix[i][a]=matrix[i][b];
				matrix[i][b]=temp;
				a++;b--;
			}
		}
        
    }
	
	public static void swap(int mat[][] , int i , int j) {
		int temp = mat[i][j];
		mat[i][j]=mat[j][i];
		mat[j][i]=temp;
	}
	
	public static void printInMatrixStyle(int mat[][]) {
			
		for(int[] row:mat)
		System.out.println(Arrays.toString(row));
	}

}
