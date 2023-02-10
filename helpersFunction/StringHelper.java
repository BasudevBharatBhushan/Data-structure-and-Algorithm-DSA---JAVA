package helpersFunction;

public class StringHelper {
	public boolean isPalindrome(String s) {
		return isPalindrome(s, 0);
	}
	
	private boolean isPalindrome(String s, int i) {
		if(i>= s.length()/2)return true;
		
		if(s.charAt(i) != s.charAt(s.length()-i-1));
		
		return isPalindrome(s,i+1);
	}
}
