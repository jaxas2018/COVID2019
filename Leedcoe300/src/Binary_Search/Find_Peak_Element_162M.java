package Binary_Search;

public class Find_Peak_Element_162M {

	public static void main(String[] args) {
		int[]nums= {1,3,5,2,2};
		int result=findPeak(nums);
		System.out.println(result);

	}
	
	public static int findPeak(int[] nums) {
		  int left = 0, right = nums.length-1;
		    while (left < right) {
		        int mid = (left+right) >> 1;
		        if (nums[mid] < nums[mid+1]) left = mid+1;
		        else {
		            
		            right = mid;
		        }
		    }
		    return left;
	}

}
