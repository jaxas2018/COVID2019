
public class MissTwoNums {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7,9,10,11,13};
		int[] results=twoMissing(nums);
		for(int i=0;i<results.length;i++) {
			System.out.print(results[i]+" ");
		}

	}
	
	public static int[] twoMissing(int[] arr) {
		int size=arr.length + 2;
		int totalSum=size * (size + 1)/2;
		int arrSum=0;
		for(int i:arr) arrSum+=i;
		
		int pivot=(totalSum-arrSum)/2;
		
		int totalLeftXOR=0;
		int arrLeftXOR=0;
		int totalRightXOR=0;
		int arrRightXOR=0;
		
		for(int i=1;i<=pivot;i++) totalLeftXOR^=i; 
		for(int i=pivot+1;i<=size;i++) totalRightXOR^=i; 
		
		for(int i:arr) {
			if(i<=pivot) arrLeftXOR ^=i;
			else arrRightXOR ^=i;
		}
		
		return new int[] {totalLeftXOR ^ arrLeftXOR,
				totalRightXOR ^ arrRightXOR	
		};
		
	}

}
