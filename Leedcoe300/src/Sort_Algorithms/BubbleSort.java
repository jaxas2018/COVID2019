package Sort_Algorithms;

public class BubbleSort {
	static int count = 0;

	public static void bubbleSort(int arr[]) {

		for (int i = arr.length - 1; i > 0; i--)
			for (int j = 0; j < i; j++)
				if (arr[j] > arr[j + 1]) {
					// swap temp and arr[i]
					// int temp = arr[j];
					// arr[j] = arr[j+1];
					// arr[j+1] = temp;
					swap(arr, j, j + 1);
					count++;
				}
	}

	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

	/* Prints the array */
	void printArray(int arr[]) {

		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[]) {
		BubbleSort bs = new BubbleSort();

		int[] arrs = { 9, 4, 3, 1, 6, 7 };
		bubbleSort(arrs);
		System.out.println("Sorted array");

		for (int num : arrs)
			System.out.print(num + " ");
	}

}

/*
 * 1. Worst and Average Case Time Complexity: O(n*2). Worst case occurs when
 * array is reverse sorted.
 * 
 * 2. Best Case Time Complexity: O(n). Best case occurs when array is already
 * sorted.
 * 
 * 3. Auxiliary Space: O(1)
 * 
 * 4. Boundary Cases: Bubble sort takes minimum time (Order of n) when elements
 * are already sorted.
 * 
 * 5. Sorting In Place: Yes
 * 
 * 6. Stable: Yes
 */
