import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		int n=5;
		int[][] queries= {{1,2,100},{2,5,100},{3,4,100}};
		long max=arrayManipulation(n,queries);
		System.out.println(max);

	}
	
	 static long arrayManipulation(int n, int[][] queries) {
	        
	        long outputArray[] = new long[n + 2];
	        for (int i = 0; i < queries.length; i++) {
	            int a = queries[i][0];
	            int b = queries[i][1];
	            int k = queries[i][2];
	            outputArray[a] += k;
	            outputArray[b+1] -= k;
	        }
	        long max = getMax(outputArray);
	        return max;

	    }

	     private static long getMax(long[] inputArray) {
	        long max = Long.MIN_VALUE;
	        long sum = 0;
	        for (int i = 0; i < inputArray.length; i++) {
	            sum += inputArray[i];
	            max = Math.max(max, sum);
	        }
	        return max;

	     }

}
