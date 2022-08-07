package rough;
import java.util.*;
public class LinkedList_Of_Arrays {

	public static void main(String[] args) {
		List<int[]> list = new LinkedList<>();
		
		
		System.out.println(new int[] {1,2,3});
		
		System.out.print(new ArrayList(Arrays.asList(1, 2, 2, 3)));
		
		int array[]= {1,2,3};
		
		 Set<Integer> set = new HashSet<>();
		 
		
		 
		
//		list.add(new int[] {1,2});
//		list.add(new int[2]);
//		
//		System.out.println(list.get(0)[0]);

		int [][] arr = new int[3][3];
		
		Arrays.stream(arr).forEach(a->Arrays.fill(a, 3));
		
		printInMatrixStyle(arr);
	}
	
public static void printInMatrixStyle(int mat[][]) {
		
		//Loop through all the rows
		for(int[] row:mat)
			//converting each row as string
			//and then printing in a separate line
			System.out.println(Arrays.toString(row));
	}

}
