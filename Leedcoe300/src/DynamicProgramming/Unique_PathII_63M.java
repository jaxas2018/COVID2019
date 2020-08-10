package DynamicProgramming;

public class Unique_PathII_63M {

	public static void main(String[] args) {
		int[][] nums= {
				{0,0,0,1},
				{0,0,0,0},
				{0,1,0,0},
				{0,0,0,0}
				};
		
		int result=uniquePaths(nums);
		System.out.println(result);

	}
	
	 public static int uniquePaths(int[][] obstacleGrid) {
		 
		 int m=obstacleGrid.length;
		 int n=obstacleGrid[0].length;
		 
		 int[][] dp=new int[m][n];
		 
		 for(int i=0;i<dp.length;i++) {
			 if(obstacleGrid[i][0]!=1) dp[i][0]=1;
			 else break;
		 }
		 
		 for(int j=0;j<dp[0].length;j++) {
			 if(obstacleGrid[0][j]!=1) dp[0][j]=1;
			 else break;
			  
		 }
		 
		 for(int i=1;i<dp.length;i++) {
			 for(int j=1;j<dp[i].length;j++) {
				 if(obstacleGrid[i][j]!=1) dp[i][j]=dp[i-1][j]+dp[i][j-1];
			 }
		 }
		 return dp[m-1][n-1];
	        
	}

}