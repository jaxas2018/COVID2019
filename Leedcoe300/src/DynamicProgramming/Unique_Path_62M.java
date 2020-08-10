package DynamicProgramming;

public class Unique_Path_62M {

	public static void main(String[] args) {
		int m=7;
		int n=3;
		
		int result=uniquePaths(m,n);
		System.out.println(result);

	}
	
	 public static int uniquePaths(int m, int n) {
		 
		 int[][] dp=new int[m][n];
		 for(int i=0;i<dp.length;i++) {
			 dp[i][0]=1;
		 }
		 
		 for(int j=0;j<dp[0].length;j++) {
			 dp[0][j]=1;
		 }
		 
		 for(int i=1;i<dp.length;i++) {
			 for(int j=1;j<dp[i].length;j++) {
				 dp[i][j]=dp[i-1][j]+dp[i][j-1];
			 }
		 }
		 return dp[m-1][n-1];
	        
	}

}
