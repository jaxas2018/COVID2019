package Binary_Search;

public class Search_In_Rotated_Array_81M {

	public static void main(String[] args) {
		int[] nums= {2,5,6,0,0,1,2};
		boolean result=search(nums,3);
		System.out.println(result);

	}
	
	public static boolean search(int[] nums, int target) {
		
		int left=0;
	    int right=nums.length-1;
	 
	    while(left<=right){
	        int mid = (left+right)/2;
	        if(nums[mid]==target)
	            return true;
	 
	        if(nums[left]<nums[mid]){
	            if(nums[left]<=target&& target<nums[mid]){
	                right=mid-1;
	            }else{
	                left=mid+1;
	            }
	        }else if(nums[left]>nums[mid]){
	            if(nums[mid]<target&&target<=nums[right]){
	                left=mid+1;
	            }else{
	                right=mid-1;
	            }
	        }else{
	            left++;
	        }    
	    }
	 
	    return false;
	}
}
