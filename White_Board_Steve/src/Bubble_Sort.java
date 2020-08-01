 
public class Bubble_Sort {

	public static int[] bubbleSort(int arr[]) {
		
		int i, j, temp;
		
		for(i = 0; i < arr.length; i++) {
			
			 
		}
		
		return null;
	}
	
	/* Prints the array */
    void printArray(int arr[])
    {
         
        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
         
        int arr[] = {9,4,3,1};   
         
        //System.out.println("Swap Times for bubble sort is "+bs.count);
        
        int[] arrs = {9,4,3,1,6,7}; 
        bubbleSort(arrs);
        for(int num:arrs)
        System.out.print(num+" ");
    }

}
