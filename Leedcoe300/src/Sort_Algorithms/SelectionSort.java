package Sort_Algorithms;

public class SelectionSort {
	int count=0;/* count the times of swap*/
	
    public int[] sort(int[] arr){
    	
    	int i,j,minValue,minIndex;
    	
        for (i=0; i<arr.length; i++){
        	minValue=arr[i];
        	minIndex=i;
        	
        	for(j=i+1;j<arr.length;j++) {
        		if(arr[j]<minValue) {
        			minValue=arr[j];
        			minIndex=j;
        		}
        	}
        	
        	if(minValue<arr[i]) {
        		int temp=arr[i];
        		arr[i]=arr[minIndex];
        		arr[minIndex]=temp;
        		
        	}
        }
        
        return arr;
             
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
        int arr[] = {12, 11, 13, 5, 6,3,9};   
        
        InsertionSort is = new InsertionSort();        
        is.sort(arr);
         
        printArray(arr);
        System.out.println("Swap times is "+is.count);
        
       
    }
}  
/*
1. Time Complexity: O(n*n)

2. Auxiliary Space: O(1)

3. Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. 
And it takes minimum time (Order of n) when elements are already sorted.

4. Algorithmic Paradigm: Incremental Approach

5. Sorting In Place: Yes

*/

