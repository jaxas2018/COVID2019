package Sort_Algorithms;

/* Java program for Merge Sort */
class MergeSort
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]  

    public static void main(String[] args) {
    	int arr[] = {12, 11, 13, 5, 6, 7, 67};
    	 
        System.out.println("Given Array");
        for(int i=0; i<arr.length;i++){
        	System.out.print(arr[i]+" ");
        }
 
         
        mergeSort(arr);
        
        System.out.println("\nSorted Array");
        for(int i=0; i<arr.length;i++){
        	System.out.print(arr[i]+" ");
        }  
    }

    public static void mergeSort(int[] inputArray) {
        int size = inputArray.length;
        if (size < 2)
            return;
        int mid = size / 2;
        int leftSize = mid;
        int rightSize = size - mid;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        for (int i = 0; i < mid; i++) {
            left[i] = inputArray[i];

        }
        for (int i = mid; i < size; i++) {
            right[i - mid] = inputArray[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, inputArray);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < leftSize) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < rightSize) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }
}
 /*
1. Time Complexity: Sorting arrays on different machines. Merge Sort is a recursive algorithm and time complexity 
   can be expressed as following recurrence relation.
   T(n) = 2T(n/2) + \Theta(n)
   The above recurrence can be solved either using Recurrence Tree method or Master method. It falls in case II of 
   Master Method and solution of the recurrence is \Theta(nLogn).
   Time complexity of Merge Sort is \Theta(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the array in two halves and take linear time to merge two halves.

2. Auxiliary Space: O(n)

3. Algorithmic Paradigm: Divide and Conquer

4. Sorting In Place: No in a typical implementation

5. Stable: Yes
  */

