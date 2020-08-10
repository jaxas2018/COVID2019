package Binary_Search;

public class Two_SumII_167E {

	public static void main(String[] args) {
		int[] numbers= {2,4,7,10,11,15,18};
		int target=17;
		int[] result=twoSum(numbers,target);
		
		System.out.println(result[0]+" "+result[1]);

	}
	
	public static int[] twoSum(int[] numbers, int target) {
		
		if(numbers==null || numbers.length<2) return null;
	 
		int length=numbers.length;
		int left=0;
		int right=length-1;
		
		while(left<right) {
			 int sum=numbers[left]+numbers[right];
			 if(sum<target) {
				left++; 
			 }else if(sum>target) {
				 right--;
			 }else {
				 return new int[]{left,right};
			 }
		}	
		
		return null;
	}

}
