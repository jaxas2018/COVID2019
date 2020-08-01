
public class Max_Min {

	public static void main(String[] args) {
		int[] nums= {4,6,3,9,6};
		
		int max=findMax(nums);
		int min=findMin(nums);
		System.out.println("Maximum is "+max);
		System.out.println("Minimum is "+min);

	}

	private static int findMin(int[] nums) {
		
		int min=nums[0];
			for(int i=0; i<nums.length; i++) {
				if(min <nums[i]) {
					min=nums[i];
				}
			}
			 
			return min;
	}

	private static int findMax(int[] nums) {
		int max=nums[0];
			for(int i=0; i<nums.length; i++) {
				 
				if(max>nums[i]) {
					max=nums[i];
				}
			}
			 
			return max;
	}
	
	

}
