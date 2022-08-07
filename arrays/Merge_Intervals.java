package arrays;
import java.util.*;
public class Merge_Intervals {

	public static void main(String[] args) {
		

	}
	
	static int[][] overlappedInterval(int[][] intervals){
		
		ArrayList<int[]> list = new ArrayList<>();
		
		if(intervals.length ==0 || intervals ==null) return list.toArray(new int[0][]);  //return an empty array
		
		Arrays.sort(intervals , (a,b) -> a[0]-b[0]);
		
		
		
		int start = intervals[0][0];
		int end = intervals[0][1];
		
		//Traversing the matrix column wise
		for(int []i:intervals) {
			
			if(i[0]<end) {
				end = Math.max(end, i[1] );
			}else {
				list.add(new int[]{start , end});
				start = i[0];
				end = i[1];
			}
		}
		
		
		return list.toArray(new int[0][1]);
		
	}

}
