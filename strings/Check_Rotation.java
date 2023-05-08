package strings;

public class Check_Rotation {

	public static void main(String[] args) {
		String s = "abcde", goal = "cdeab";
		
		System.out.println(rotateString(s, goal));
	}
	public static boolean rotateString(String s, String goal) {

        if(s.length() != goal.length())return false;

        String temp = goal+goal;

        int i = 0;
        while(i<temp.length()){
            if(temp.charAt(i)==s.charAt(0)){
                int j = 0;
                int k = i;
                while(j<s.length() && k<temp.length() && temp.charAt(k) == s.charAt(j)){
                    j++;
                    k++;
                }
                if(j==s.length())return true;
            }

            i++;
            
        }
        return false;

    }

}
