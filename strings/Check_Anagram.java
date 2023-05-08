package strings;

public class Check_Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "margana"));
	}

	public static boolean isAnagram(String s, String t) {

		if(s.length() != t.length())return false;

		int ascii[] = new int[26];

		int n  = s.length();

		for(int i = 0 ; i< n ; i++){
			ascii[(int)s.charAt(i)-97]++;
		}

		for(int i = 0 ; i< n ; i++){
			if(ascii[(int)t.charAt(i)-97] == 0)return false;
			ascii[(int)t.charAt(i)-97]--;
		}

		return true;

	}


}
