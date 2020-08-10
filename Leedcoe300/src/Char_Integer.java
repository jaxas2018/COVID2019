
public class Char_Integer {

	public static void main(String[] args) {
		 String s = "snuffleupagus";
	     int[] arr = new int[26];
	    

	        for (int i = 0; i < s.length(); i++) {
	            arr[s.charAt(i)-'a']++;
	        }

	        for (int i = 0; i < arr.length; i++) {
	            System.out.println((char)(i + 'a') + ": " + arr[i]);
	        }
	        
	        int x=s.charAt(1)-'z';
	        char y=(char) (x+'z');
	        
	        System.out.println("y is "+y);

	}

}
