import java.util.Scanner;

public class Left_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		Scanner scan=new Scanner(System.in);
		int arr_n=scan.nextInt();
		int rotate_n=scan.nextInt();
		
		int[] arr=new int[arr_n];
		int[] arr2=new int[arr_n];
		for(int i=0;i<arr_n;i++) {
			arr[i]=scan.nextInt();
		}
	 
		
		for(int i=0;i<arr_n;i++) {
			if((i+rotate_n)<arr_n) {
				arr2[i]=arr[i+rotate_n];
			}else {
				arr2[i]=arr[(i+rotate_n)-arr_n];
			}
		}
		
		for(int i=0;i<arr_n;i++) {
			System.out.print(arr2[i]+" ");
		}
	 
	}

}
