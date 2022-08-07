package arrays;
import java.util.*;
public class Repeat_N_Missing_Number {

	public static void main(String[] args) {
		

	}
	
	public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
		ArrayList<Integer> list = new ArrayList<>();
		
		int N = A.size();
		
		long s = (N*(N+1))/2;
		long p = (N*(N+1)*(2*N+1))/6;
		
		long s1 = 0 , p1 = 0;
		
		for(int i = 0 ; i<N ; i++) {
			int e = A.get(i);
			s1 +=  e;
			p1 += (e*e);
		}
		
		long S = s-s1;
		long P = p - p1;
		
		long x = ((P/S)-S)/2;
		long y = x - S;
		
		list.add((int)x);
		list.add((int)y);
		
		return list;
    }

}
