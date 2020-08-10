package Binary_Search;

public class First_Last_Position_SortedArray_34M {
	
	
	public static void main(String[] args) {
		int[] nums= {1,2,2};
		int[] result=searchRange(nums,2);
		for(int num:result)
		System.out.println(num+" ");

	}
	
	public static int[] searchRange(int[] nums, int target) {
		
		if(nums==null||nums.length==0) return new int[] {-1,-1};
		int length=nums.length;
		int left=0;
		int right=length-1;
		
		if(target <nums[0] || target>nums[right]) return new int[] {-1,-1};
		 
	 
		int first=0;
		int last=0;
		while(left+1<right) {
			int mid=left+(right-left)/2;
			if(target==nums[mid]) {
				first=mid;
				last=mid;
				while( first>0 && nums[first-1]==target) {
					first--;
				}
				while(last+1<length && nums[last+1]==target) {
					last++;
				}
				 
				return new int[] {first,last};
			}
			if(nums[left]<=target && target <nums[mid]) {
				right=mid;
				 
			} 
			else {
				left=mid;
			}
		 
	}	 

		if(nums[left]==target && nums[right]==target) return new int[] {left,right};
		else if(nums[left]==target) return new int[] {left,left};
		else if(nums[right]==target) return new int[] {right,right};
		return new int[]{-1,-1};
    }

}
