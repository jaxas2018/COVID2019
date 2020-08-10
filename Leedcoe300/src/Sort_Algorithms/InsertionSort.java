package Sort_Algorithms;


//Java program for implementation of Insertion Sort

/*Function to sort array using insertion sort*/

public class InsertionSort {
	
		int count=0;/* count the times of swap*/
		
	    public void sort(int[] arr)
	    {
	        for (int i=1; i<arr.length; ++i)
	        {
	            int key = arr[i];
	            int j = i-1;
	 
	            /* Move elements of arr[0..i-1], that are
	               greater than key, to one position ahead
	               of their current position */
	            while (j>=0 && arr[j] > key)/*--Do you know the difference between &(check both) and &&(check the 2nd only if 
	                                            the first is true--*/
	            {
	            	int temp=arr[j];
	            	arr[j]=key;
	                arr[j+1] = temp;
	                j = j-1;
	                count++;
	            }
	        }
	    }
	 
	    /* A utility function to print array of size n*/
	    static void printArray(int arr[])
	    { 
	        for (int i=0; i<arr.length; ++i)
	            System.out.print(arr[i] + " ");
	 
	        System.out.println();
	    }
	 
	    // Driver method
	    public static void main(String args[])
	    {        
	        int arr[] = {12, 11, 13, 5, 6,3,34,1};   
	        
	        InsertionSort is = new InsertionSort();        
	        is.sort(arr);
	         
	        printArray(arr);
	        System.out.println("Swap times is "+is.count);
	        
	       
	    }
	}  
/*
1. Time Complexity: O(n*n)

2. Auxiliary Space: O(1)

3. Boundary Cases: Selection sort takes maximum time to sort if elements are sorted in reverse order. 
And it takes minimum time (Order of n) when elements are already sorted.

4. Algorithmic Paradigm: Incremental Approach

5. Sorting In Place: Yes

*/
