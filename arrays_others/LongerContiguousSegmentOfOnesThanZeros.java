package arrays_others;

public class LongerContiguousSegmentOfOnesThanZeros {

	public static void main(String[] args) {
		
		System.out.println(checkZeroOnes("101"));

	}
	public static boolean checkZeroOnes(String s) {
        return (countMax(s, '1') > countMax(s,'0'));
    }
    private static int countMax(String s , char x){

        int maxHere = 0, max = 0;

        char c[] = s.toCharArray();

        for(char e:c){
            max = Math.max(max, maxHere = e!=x?0:maxHere+1);
        }
        return max;

    }

}
