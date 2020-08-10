package Binary_Search;
/*
 * Solution:
 * This is a great problem of Dynamic programming, a good extension of 62. Unique Path, and 63. Unique Path II 
 * Using the example given above, obviously, the knight must be at least 6 hp before he enter the princess grid,if the knight 
 * came from the upside grid[1][2], he must have at least 5 hp to ensure he can save the princess, while if the knight came from 
 * the left side grid[1][2], the knight need to have at least 1 hp to save the princess. For grid[1][1], it has two options, either 
 * go to its right, or go downwards, if it moves to right, the minimum hp is Math.max(5+10,1)=15, on the other hand if it move 
 * downwards, the minimum hp is Math.max(1+10,1)=11, so the minimum hp before he enter this grid and can still save the princess 
 * is Math.min(15,11)=11. 
 * Summary:The minimum hp for right column is hp[i-1][j]= Math.max(hp[i][j]-dungeon[i-1][j], 1). For bottom row, 
 * hp[i][j-1]=Math.max(hp[i][j]-dungeon[i][j-1], 1). 
 * For all others, hp[i-1][j-1]= Math.min(Math.max(hp[i][j-1]-dungeon[i-1][j-1], 1), Math.max(hp[i-1][j]-dungeon[i-1][j-1]));
 * Similarly, we can use one dimensional array instead of 2-d to calculate the final minimum hp.
 * Time complexity: O(m*n), extra space used: O(m)
 */
 

public class Dungeon_Game_174H {

	public static void main(String[] args) {
		int[][] dungeon= {
				{-2,-3,3},
				{-5,-10,1},
				{10,30,-5}
		};
		
		int result=calculateMinimumHP(dungeon);
		System.out.println(result);
	}
	
	public static int calculateMinimumHP(int[][] dungeon) {
		
		 if(dungeon == null || dungeon.length == 0) {
	            return 1;
	        }
	        
	        int m = dungeon.length;
	        int n = dungeon[0].length;
	        int[][] f = new int[m][n];
	        f[m - 1][n - 1] = Math.max(1, 1 - dungeon[m - 1][n - 1]);
	        
	        for(int i = m - 2; i >= 0; i--) {
	            f[i][n - 1] = Math.max(1, f[i + 1][n - 1] - dungeon[i][n - 1]);
	        }
	        
	        for(int j = n - 2; j >= 0; j--) {
	            f[m - 1][j] = Math.max(1, f[m - 1][j + 1] - dungeon[m - 1][j]);
	        }
	        
	        for(int i = m - 2; i >= 0; i--) {
	            for(int j = n - 2; j >= 0; j--) {
	                f[i][j] = Math.max(1, Math.min(f[i][j + 1], f[i + 1][j]) - dungeon[i][j]);
	            }
	        }
	        
	        return f[0][0];
 
    }

}
