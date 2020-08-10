package Binary_Search;

public class Median_Two_Arrays_4H {

	public static void main(String[] args) {
		int[] nums1= {1,3,8,9,10};
		int[] nums2= {2};
		double result=findMedianSortedArrays(nums1,nums2);
		System.out.println(result);	

	}
	/*
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 if(nums1==null) return findMedianSortedArrays(new int[0], nums2);
		 if(nums2==null) return findMedianSortedArrays(nums1, new int[0]);
		 
		 int m=nums1.length;
		 int n=nums2.length;
		 int length=m+n;
		 
		 if(m>n) return findMedianSortedArrays(nums2,nums1);
		 
		 if(nums1[0]>nums2[n-1] || nums1[m-1]<nums2[0]) {
			 if(length%2==1) {
				 return nums2[length/2];
			 }else {
				 return (nums2[length/2-1]+nums2[length/2])/2;
			 }
		 }
		 
		 int left=0;
		 int right=m;
		 
		 while(left<=right) {
			 int pivotM=(right+left)/2;
			 int pivotN=(m+n)/2-pivotM;
			 
			 int maxLeftM=nums1[pivotM-1];
			 int minRightM=nums1[(pivotM)];
			 
			 int maxLeftN=nums2[pivotN-1];
			 int minRightN=nums2[pivotN];
			 
			 if(maxLeftM<=minRightN && maxLeftN <=minRightM) {
				 if(length%2==1) {
					 return Math.max(maxLeftM, maxLeftN);
				 }else {
					 return (Math.max(maxLeftM, maxLeftN)+Math.min(minRightM, minRightN))/2;
				 }
			 }else if(maxLeftM>minRightN) {
				 right=pivotM-1;
			 }else if(maxLeftN>minRightM) {
				 left=pivotM+1;
			 }
			 
		 }
			
		 return 0.0;
	        
	  }*/
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null) return findMedianSortedArrays(new int[0], nums2);
        if (nums2 == null) return findMedianSortedArrays(nums1, new int[0]);
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);
        int m = nums1.length, n = nums2.length;
        int k = (m + n) / 2;
        int l = 0, r = m - 1;
        
        if(nums1[0]>nums2[n-1]) {
        	if((m+n)%2==1) {
        		return nums2[k];
        	}else {
        		return (nums2[k-1]+nums2[k])/2;
        	}
        }else if(nums1[m-1]<nums2[0]) {
        	if((m+n)%2==1) {
        		return nums2[k-m];
        	}else {
        		return (nums2[k-m-1]+nums2[k-m])/2.0;
        	}
        }
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums1[mid] < nums2[k - mid - 1]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        double candidate1 = Math.min(l == m ? Integer.MAX_VALUE : nums1[l], k - l == n ? Integer.MAX_VALUE : nums2[k - l]);
        if ((m + n) % 2 == 1) return candidate1;
        double candidate2 = Math.max(l == 0 ? Integer.MIN_VALUE : nums1[l - 1], k - l == 0 ? Integer.MIN_VALUE : nums2[k - l - 1]);
        return (candidate1 + candidate2) / 2;
    }

}