package Backtracking;

public class String_Permutationa {

	static String swap(String s, int i, int j) {
	    char [] c = s.toCharArray();
	    char tmp = c[i];
	    c[i] = c[j];
	    c[j] = tmp;
	    return String.copyValueOf(c);
	}

	static void permute(String s, int start) {
		
	    int end = s.length();
	
	    if(start == end) {
	        System.out.println(s);
	        return;
	    }
	
	    permute(s, start + 1);
 
	    for(int i = start + 1; i < end; i++) {
	        if(s.charAt(start) == s.charAt(i)) continue;
	        s = swap(s, start, i);
	        permute(s, start + 1);
	         
	    }
	}

	public static void main(String [] args) {
	    String s = "AAC";
	    permute(s, 0);
	    
	}
}