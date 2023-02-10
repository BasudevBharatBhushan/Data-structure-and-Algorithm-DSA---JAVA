package rough;
import java.util.*;
public class Rough {

	public static void main(String[] args) {
		String line1 = "Humpty Dumpty sat on a wall.";
		String line2 = "Humpty Dumpty had a great fall.";
		String rhyme = line1 + "\n" + line2;
		
		String mainString = "Humpty Dumpty sat on a wall Humpty Dumpty had a great fall.";
		
		System.out.println(processString(mainString, rhyme));
		
	}
	
	static int cal(int x , int y) {
		if(x<y) {
			return cal(y,x);
		}else if (y==0) {
			return x;
		}else {
			return cal(y, x%y);
		}
	}
	
	public static String processString (String mainString, String strs) {
		
		Set<String> testwords = new HashSet<>();
		
		int n = mainString.length();
		int m = strs.length();
		
		String tempString = "";
		for(int i = 0; i< n ; ) {
			if(mainString.charAt(i)!= ' ') {
				while(i<n && mainString.charAt(i)!=' ') {
					tempString+=mainString.charAt(i);
					i++;
				}
//				System.out.println(tempString);
				testwords.add(tempString);
			}
			tempString = "";
			i++;
		}
		
		System.out.println(testwords);
		
		for(int i = 0; i< m;) {
			if(strs.charAt(i)!= ' ') {
				while(i<m && strs.charAt(i)!=' ') {
					tempString+=strs.charAt(i);
					i++;
				}
				if(!testwords.contains(tempString)) {
					return "No";
				}
			}
			tempString="";
			i++;
		}
		
		System.out.println(testwords);
		
		return "Yes";
	}

}
