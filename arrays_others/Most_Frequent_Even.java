package arrays_others;
import java.util.*;
public class Most_Frequent_Even {

	public static void main(String[] args) {
		System.out.println(mostFrequentEven(new int[] {0 , 1, 2, 2, 4, 4, 1}));
	}
    public static int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq[] = new int[2];  //1st index element, 2nd element frequency
        maxFreq[0]=-1;

        for(int e:nums){
            if((e&1)==0){
                if(map.containsKey(e)){
                    map.put(e, map.get(e)+1);
                }else{
                    map.put(e, 1);
                }
                if(map.get(e) > maxFreq[1]){
                    maxFreq[0]=e;
                    maxFreq[1]=map.get(e);
                }else if(map.get(e)==maxFreq[1]){
                    if(e < maxFreq[0]){
                        maxFreq[0]=e;
                    }
                }
            }
        }
        return maxFreq[0];
    }

}
