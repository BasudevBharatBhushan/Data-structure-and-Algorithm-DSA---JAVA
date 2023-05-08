package strings;

import java.util.HashMap;
import java.util.Map;

public class Most_Common_Word {

	public static void main(String[] args) {
		
		String s = "Bob hit, a ?!Ekball";
		String arr[]=s.split("[,.?;:!'\\s]+");
		
		for(String e:arr) {
			System.out.print(e+" ");
		}
		
		
		
		
	}
	public String mostCommonWord(String paragraph, String[] banned) {
		
		String arr[]=paragraph.split("[,.?;:!'\\s]+");
		Map<String, Integer> freq = new HashMap<>();
		
		for(String e:arr) {
			
			String s = e.toLowerCase();
			
			
			
			if(freq.containsKey(s)) {
				freq.put(s, freq.get(s)+1);
			}else {
				freq.put(s, 1);
			}
		
			
		}
		
		return "";
	}

}
