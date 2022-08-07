package rough;
import java.util.*;
public class Set_Functions {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
//		int arr[] = {9,1,-3,2,4,8,3,-1,6,-2,-4,7};
		int arr[]= {-3,-1,-2};
		
		for(int e:arr) {
			set.add(e);
		}
		
		System.out.println(set);
	}

}
