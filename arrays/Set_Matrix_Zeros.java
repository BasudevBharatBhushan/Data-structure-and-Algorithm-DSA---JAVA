package arrays;
import java.util.*;
public class Set_Matrix_Zeros {

	public static void main(String[] args) {
		int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
		setZeros_O_1_Space(arr);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}
	
	
	//First Approach - Time - O(n) and space --- 0(n)
	public static void setZeros(int a[][]) {
		int rows = a.length;
		int col = a[0].length;
		
		int dummy1[]= new int[rows];
		int dummy2[] = new int[col];
		
		Arrays.fill(dummy1,-1);
		Arrays.fill(dummy2,-1);
		
		for(int i = 0 ; i< rows ;i++) {
			for(int j = 0 ; j<col ; j++) {
				if(a[i][j]==0) {
					dummy1[i]=0;
					dummy2[j]=0;
				}
			}
		}
		
		for(int i = 0; i<rows ; i++) {
			for(int j = 0; j<col ; j++) {
				if(dummy1[i]==0 || dummy2[j]==0) {
					a[i][j]=0;
				}
			}
		}
	}
	
	//Approach 2 - Time - O(n) and Space - O(1)
	public static void setZeros_O_1_Space(int[][] matrix){
		int col0 = 1 , rows = matrix.length , col= matrix[0].length;
		
		
		//Change the dummy arrays to 0 if m[i]m[j] = 0
 		
		for(int i = 0 ; i< rows ; i++) {
			if(matrix[i][0]==0)col0=0;   //if any element of row dummy matrix is zero, make colo= 0
			
			for(int j = 1 ; j<col ;j++) {
				if(matrix[i][j]==0) {
					matrix[i][0]=matrix[0][j]=0;
				}
			}
			
		}
		
		//Starting from the first would have updated our dummy array which we are using as our reference array
		/*
		 * for m[i][j], if col[i] ==0 || row[j]==0 => m[i][j]=0
		 */
		for(int i = rows-1 ; i>=0 ;i--) {
			for(int j = col-1 ; j>=1;j--) {
				if(matrix[i][0]==0 || matrix[0][j]==0) {
					matrix[i][j]=0;
				}
			}
			if(col0 ==0)matrix[i][0]=0;
		}
		
	}
	
	public static void setZeros_O_1_Space_ternary(int[][] matrix){
		int col0 = 1 , rows = matrix.length , col= matrix[0].length;
		
		
		//Change the dummy arrays to 0 if m[i]m[j] = 0
 		
		for(int i = 0 ; i< rows ; i++) {
			if(matrix[i][0]==0)col0=0;   //if any element of row dummy matrix is zero, make colo= 0
			col0=(matrix[i][0]==0?0:1);
		
			
			for(int j = 1 ; j<col ;j++) {
				if(matrix[i][j]==0) {
					matrix[i][0]=matrix[0][j]=0;
				}
			}
			
		}
		
		//Starting from the first would have updated our dummy array which we are using as our reference array
		/*
		 * for m[i][j], if col[i] ==0 || row[j]==0 => m[i][j]=0
		 */
		for(int i = rows-1 ; i>=0 ;i--) {
			for(int j = col-1 ; j>=1;j--) {
				if(matrix[i][0]==0 || matrix[0][j]==0) {
					matrix[i][j]=0;
				}
			}
			if(col0 ==0)matrix[i][0]=0;
		}
		
	}

}
