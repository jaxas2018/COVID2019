package Binary_Search;

public class Minimum_in_Rotated_Array_153M {

	public static void main(String[] args) {
		int[] nums= {7,8,9,1,3,4,5};//output 0
		int result=findMin(nums);
		System.out.println(result);

	}
	
	public static int findMin(int[] nums) {
        if(nums==null || nums.length==0) return -1;
        
        int length=nums.length;
        int left=0;
        int right=length-1;
        int mid=0;
        
        
        
        while(left<=right) {
        	
        	if(nums[left]<nums[right]) return nums[left];
        	
        	mid=left+(right-left)/2;
        	if(mid>0 && nums[mid-1]>nums[mid]) return nums[mid];
        	
        	if(nums[mid]<nums[right]) {
        		right=mid;
        	}else if(nums[mid]>nums[right]) {
        		left=mid+1;
        	}
        }
		return -1;
    }

}
