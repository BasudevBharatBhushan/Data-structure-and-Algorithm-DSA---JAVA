package strings;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		System.out.println(reverseWords("          The        Boy"));
	}
	public static String reverseWords(String s) {
		
        String res = "";

        int i = s.length()-1;

        while(i>=0){
            if(s.charAt(i)==' '){
                i--;
            }else{
            	String temp = "";
                while(i>=0 && s.charAt(i)!=' '){
                    temp = s.charAt(i)+temp;
                    i--;
                }
                res =res+ temp+" " ;
            }
        
            
        }
        res = res.substring(0, res.length()-1);
        return res;
    }

}
