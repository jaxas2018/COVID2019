package Binary_Search;

public class Minimum_in_Rotated_Array_154H {

	public static void main(String[] args) {
		int[] nums= {5,6,3,3,3};//output 0
		//int[] nums= {3,1,3};
		int result=findMin(nums);
		System.out.println(result);

	}
	
	public static int findMin(int[] nums) {
		   if(nums==null ||nums.length==0) return -1;
		   int left=0;
		   int right=nums.length-1;
		 
		/*
		 * while(left<=right){
		 * 
		 * //handle cases like [3, 1, 3] while(nums[left]==nums[right] && left!=right){
		 * left++; }
		 * 
		 * if(nums[left]<=nums[right]){ return nums[left]; }
		 * 
		 * int m=left+(right-left)/2; if(nums[m]>nums[right]){ left=m+1; }else
		 * if(nums[m]<nums[right]){ right=m; }else { right--; }
		 * 
		 * }
		 */
		   while(left+1<right){
			   int m=left+(right-left)/2; 
			   if(nums[m]>nums[right]){ 
				   left=m+1;
			    }else if(nums[m]<nums[right]){ 
			    	right=m;
			    }else {
			    	right--;
			    }      
		   }
		   if(nums[left]>nums[right]) return nums[right];
		   else if(nums[left]<=nums[right]) return nums[left];
		   return -1;
	}
}
