
public class Happy_Number_202E {
	
	public static void main(String[] args) {
		boolean result=isHappy(14);
		System.out.println(result);
	}
	
	public static boolean isHappy(int n) {
	        int slow = n, fast = n;
	        while (true) {
	            slow = findNext(slow);
	            fast = findNext(findNext(fast));
	            //fast = findNext(fast);
	            if (slow == fast) break;
	        }
	        return slow == 1;
	    }
	public static  int findNext(int n) {
	        int res = 0;
	        while (n > 0) {
	            res += (n % 10) * (n % 10);
	            n /= 10;
	        }
	        return res;
	    }

}
