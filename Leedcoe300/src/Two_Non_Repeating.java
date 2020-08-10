
//Java implementation to find 
//elements that appeared only once 
//Time Complexity: O(N)
//Space Complexity: O(1)
public class Two_Non_Repeating {

	public static void main(String[] args) {
		int arr[] = {7, 8, 4, 8, 9, 1,6, 1, 4, 2, 2,6}; 
		int n = arr.length; 
 
		occurredOnce(arr, n);   
		 

	}
	
	public static void occurredOnce(int arr[], int n) 
	{ 
		int i = 1, len = n; 

		// Check if the first and last 
		// element is equal. If yes, 
		// remove those elements 
		if (arr[0] == arr[len - 1]) 
		{ 
			i = 2; 
			len--; 
		} 

		// Start traversing the 
		// remaining elements 
		for (i=1; i < n; i++) 

			// Check if current element is 
			// equal to the element at 
			// immediate previous index 
			// If yes, check the same 
			// for next element 
			if (arr[i] == arr[i - 1]) 
				i++; 

			// Else print the current element 
			else
				System.out.print(arr[i - 1] + " "); 

		// Check for the last element 
		if (arr[n - 1] != arr[0] && 
			arr[n - 1] != arr[n - 2]) 
			System.out.print(arr[n - 1]); 
	} 


}

 

