
public class Lonely_Integer {

	public static void main(String[] args) {
		/* int[] nums= {1,3,4,1,4,5,3,5,78,67,78}; */
		int[] nums= {1,2,3,4,3,5};
		int result=lonelyinteger(nums);
		System.out.println(result);

	}
	
	static int lonelyinteger(int[] a) {
		  
	    int result=0;
	    for(int i=0;i<=a.length-1;i++)
	        {
	        result=result^a[i];
	    }
	    return result;

	    }
}
