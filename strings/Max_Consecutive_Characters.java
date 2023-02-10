package strings;

public class Max_Consecutive_Characters {

	public static void main(String[] args) {
		
		System.out.println(maxPower("abbcccddddeeeeedcba"));
		System.out.println(maxRepeatingCharacter("abbcccddddeeeeedcba"));
		System.out.println(maxRepeatingCharacter("aaaabbbbbccccccccdd"));

	}
	public static int maxPower(String s) {
        int maxChar = 1;
        int max = 1;

        int n = s.length();

        for(int i = 0; i< n;){

           if(i<n-1 && s.charAt(i)==s.charAt(i+1)){
               while(i<n-1 && s.charAt(i)==s.charAt(i+1)){
                   i++;
                   maxChar++;
               }

               max = Math.max(max, maxChar);
           }
           maxChar = 1;
           i++;
            
        }

        return max;

    }
	
	//To find the max repeating character
	public static char maxRepeatingCharacter(String s) {
        int maxChar = 1;
        int max = 1;
        char c = s.charAt(0);

        int n = s.length();

        for(int i = 0; i< n;){

           if(i<n-1 && s.charAt(i)==s.charAt(i+1)){
               while(i<n-1 && s.charAt(i)==s.charAt(i+1)){
                   i++;
                   maxChar++;
               }
               
               if(maxChar > max) {
            	   c = s.charAt(i);
            	   max = maxChar;
               }
               
           }
           maxChar = 1;
           i++;
            
        }

       return c;

    }
}
