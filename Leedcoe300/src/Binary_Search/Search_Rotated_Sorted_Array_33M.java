package Binary_Search;

public class Search_Rotated_Sorted_Array_33M {

	public static void main(String[] args) {
		int[] nums= {4,5,6,7,0,1,2};
		int index=search(nums,6);
		System.out.println("Index is "+index);

	}
	
	public static int search(int[] nums, int target) {
		
		if(nums==null || nums.length==0) return -1;
		int left=0;
		int right=nums.length-1;
		
		while(left+1<right) {
			int mid=left+(right-left)/2;
			
			if(nums[mid]==target) return mid;
			
			if(nums[left]<nums[mid]) {
				if(target>=nums[left] && target <nums[mid]) right=mid-1;
				else left=mid+1;
			}else {
				if(target >nums[mid] && target <=nums[right]) left=mid+1;
				else right=mid-1;
			}
		}
		 
		if(nums[left]==target) return left;
		else if(nums[right]==target) return right;
		return -1;
        
    }

}
