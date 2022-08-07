package arrays;
import java.util.*;
public class Longest_Substring_Without_Repeating_Character {

	public static void main(String[] args) {
//		String s = "bbbbb";
		
		String s = "pwwkew";
		
		int arr[]= {1 , 2 , 3};
		
//		System.out.println(Arrays.stream(arr).sum());
				
		
		System.out.println(lengthOfLongestSubstring(s));
		

	}
	public static int lengthOfLongestSubstring(String s) {
		int [] ascii = new int[256];
		
		int sum = 0 , j = 0 , l = 0;
		
		for(int i = 0 ; i<s.length(); i++) {
			ascii[s.charAt(i)]++;
			
			if(ascii[s.charAt(i)]>1) {
				while(ascii[s.charAt(i)]>1) {
					ascii[s.charAt(j)]--;
					j++;
				}
			}
			
			sum = Math.max(sum, Arrays.stream(ascii).sum());
			
			
		}
		
		return sum;
		
		
	}
	
	static int lengthOfSubstringOptimal(String s) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		int left = 0, right = 0;
		int n = s.length();
		int len = 0;
		
		while(right <n) {
			if(map.containsKey(s.charAt(right)))left=Math.max(map.get(s.charAt(right))+1, left);
			map.put(s.charAt(right),right);
			
			len = Math.max(len, right - left +1);
			right++;
		}
		return len;
		
		
		
	
	}

}
