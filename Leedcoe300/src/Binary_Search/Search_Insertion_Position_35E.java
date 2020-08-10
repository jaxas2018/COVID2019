package Binary_Search;

public class Search_Insertion_Position_35E {

	public static void main(String[] args) {
		int[] nums= {1,3};
		int result=search(nums,0);
		System.out.println(result);

	}
	
	
	public static int search(int[] nums, int target) {
		if(nums==null) return -1;
		int length=nums.length;
		int left=0;
		int right=length-1;
		
		if(target <=nums[0]) return 0;
		else if(target>nums[right]) return right+1;
		
		while(left+1<right) {
			int mid=left+(right-left)/2;
			if(target==nums[mid]) return mid;
			
			if(nums[left]<target && target <nums[mid]) {
				right=mid;
				 
			} 
			else {
				left=mid;
			}
		 
	}
		if(target==nums[left]) return left;
		else if(target==nums[right]) return right;
		
		return left+1;

}
}


