package Binary_Search;

public class Duplicate_Number_287M {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,4};
		int result=findDuplicate(nums);
		System.out.println(result);

	}
	
	public static int findDuplicate(int[] nums) {
		/*
		 * 
		 https://www.cnblogs.com/grandyang/p/4843654.html
		 * 
		 * 
		int res = 0, n = nums.length;
        for (int i = 0; i < 32; ++i) {
            int bit = (1 << i), cnt1 = 0, cnt2 = 0;
            for (int k = 0; k < n; ++k) {
                if ((k & bit) > 0) ++cnt1;
                if ((nums[k] & bit) > 0) ++cnt2;
            }
            if (cnt2 > cnt1) res += bit;
        }
        return res;*/
		
		 // This is the standard solution in leedcode, it is called Floyd's Tortoise and Hare
		//Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
		
		
		/*
		
		  int slow = 0, fast = 0, t = 0;
	        while (true) {
	            slow = nums[slow];
	            fast = nums[nums[fast]];
	            if (slow == fast) break;
	        }
	        while (true) {
	            slow = nums[slow];
	            t = nums[t];
	            if (slow == t) break;
	        }
	        return slow;*/
	}

}
