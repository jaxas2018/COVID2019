package DynamicProgramming;

public class Min_Domino_Rotation_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {2,1,2,4,2,2};
		int[] B= {5,2,6,2,3,3};
		System.out.println(minDominoRotations(A,B));

	}
	
	public static int minDominoRotations(int[] A, int[] B) {
		 int resultA=Math.min(countRotations(A[0],A,B), countRotations(A[0],B,A));
		 int resultB=Math.min(countRotations(B[0],A,B), countRotations(B[0],B,A));
		 int result=Math.min(resultA, resultB);
		 return result==Integer.MAX_VALUE?-1:result;
	}

	private static int countRotations(int target, int[] a, int[] b) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=target){
				if(b[i]==target){
					count++;
				}
				else{
					return Integer.MAX_VALUE;
				}
			}
		}
		return count;
	}

}

