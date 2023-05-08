package strings;

public class Isomorphic_String {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add"));
	}
    public static boolean isIsomorphic(String s, String t) {
        int m[] = new int[512];

        for(int i = 0; i< s.length(); i++){
            if(m[s.charAt(i)] != m[t.charAt(i)+256])return false;
            m[s.charAt(i)]=m[t.charAt(i)+256]=i+1;   
        }
        return true;
    }

}
