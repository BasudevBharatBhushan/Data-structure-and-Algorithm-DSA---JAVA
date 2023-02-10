package twoDimensionalArray;
import divide_N_Conquer.BinarySearch;

public class Search_a_2D_Matrix {

	public static void main(String[] args) {
		int arr2[][]= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		
		System.out.println(searchMatrix(arr2, 6));
		
	}
	public static boolean searchMatrix(int[][] matrix, int target) {

        int col = matrix.length;
        int row = matrix[0].length;

        //Step 1: First I will check if it falls on any of the range of row
        for(int i = 0; i<col; i++){
        	
            if(matrix[i][0] <= target && matrix[i][row-1]>=target){
            	
                //Step 2: Now check if the target is available in the row
            	int x = BinarySearch.binarySearch(matrix[i], 0, row, target);

            	return (x!=-1?true:false);
            }
        }
        return false;
    }
	
	

}
