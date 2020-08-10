package Binary_Search;

public class Search_2D_Matrix_74M {
	
	public static void main(String[] args) {
		int[][] matrix= {
		                  {1,3,5,7},
		                  {10,11,16,20},
		                  {23,30,34,50}
								};
		boolean result=searchMatrix(matrix,3);
		System.out.println(result);
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		
		if(matrix==null || matrix.length==0)  return false;
		int upper=0;
		int down=matrix.length;
		int cols=matrix[0].length;
		
		for(int i=0; i<matrix.length;i++) {
			
			int mid=upper+(down-upper)/2;
			while(upper<down) {
				if(target >=matrix[mid][0] && target <=matrix[mid][cols-1]) return true;
				else if(target >matrix[mid][0]) {
					upper=mid+1;
				}else {
					down=mid-1;
				}
			}
		}
		
        
		return false;
    }

}
