package Binary_Search;

public class Minimum_Size_Subarray_Sum_209M {
	
	public static void main(String[] args) {
		int[] nums= {2,4,3,10,17};
		int result=minSubArrayLen(17,nums);
		System.out.println(result);
	}
	
	public static int minSubArrayLen(int s, int[] nums) {
		if(nums==null||nums.length==0)
	        return 0;
	 
	    int i=0; 
	    int j=0;
	    int sum=0;
	 
	    int minLen = Integer.MAX_VALUE;
	 
	    while(j<nums.length){
	        if(sum<s){
	            sum += nums[j];
	            j++;        
	        }else{
	            minLen = Math.min(minLen, j-i);
	            if(i==j-1)
	                return 1;
	 
	            sum -=nums[i];
	            i++;
	        }
	    }
	 
	    while(sum>=s){
	        minLen = Math.min(minLen, j-i);
	 
	        sum -=nums[i++];
	    }
	 
	    return minLen==Integer.MAX_VALUE? 0: minLen;
	}
}
