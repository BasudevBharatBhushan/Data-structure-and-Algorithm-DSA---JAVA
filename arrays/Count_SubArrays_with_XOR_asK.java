package arrays;
import java.util.*;
public class Count_SubArrays_with_XOR_asK {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		list.add(4);
		list.add(2);
		list.add(2);
		list.add(6);
		list.add(4);
		
		System.out.println(solve(list, 6));

	}
	
	public static int solve(ArrayList<Integer> A, int k) {
        
		int count = 0, xr = 0;
		int n = A.size();
		
		
		Map<Integer, Integer> freqMap = new HashMap<>();
		
		for(int i = 0; i<n ; i++) {
			xr ^= A.get(i);
			
			
			if(freqMap.get(xr^k)!=null) 
				/*  Y = XR ^ K */
				count+=freqMap.get(xr ^ k);
			
			if(xr==k)count++;
			
			if(freqMap.get(xr)!=null)
				freqMap.put(xr, freqMap.get(xr)+1);
			else
				freqMap.put(xr, 1);
			
		}
		
		return count;
		
	
    }

}
