
public class Super_Reduced_String {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub String str="aaabccddd";
		 * System.out.println(superReducedString(str));
		 */
		String str="abaab";
		System.out.println(superReducedString(str));

	}
	
	 static String superReducedString(String s) {
		 StringBuilder insb = new StringBuilder(s);

		    boolean passNeeded = true;

		    while (passNeeded) {

		        passNeeded = false;

		        // Do a single full pass.
		        for (int i = 0; i < insb.length() - 1; ++i) {
		            char current = insb.charAt(i);
		            char next = insb.charAt(i+1);

		            if (current == next) {
		                insb = insb.delete(i, i+2);

		                // Text has changed so another pass needed.
		                passNeeded = true;
		            }

		        } // end for

		    } // end while

		    if (insb.length() == 0) {
		        return "Empty String";
		    }

		    return insb.toString();


	}

}
