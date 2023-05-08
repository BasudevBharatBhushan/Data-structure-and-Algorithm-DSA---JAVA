package strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
	}
    public static String longestCommonPrefix(String[] strs) {
        String s = strs[0];

        for(int i = 1; i< strs.length; i++){
            if(!strs[i].equals(s)){
                s = commonString(s, strs[i]);
            }
        }

        return s;
    }

    private static String commonString(String a , String b){
        String s = "";

        int i = 0;

        while(i<a.length() && i < b.length() && a.charAt(i)==b.charAt(i)){
            s += a.charAt(i);
            i++;
        }

        return s;
    }
}
