import java.util.Arrays;
import java.util.Scanner;

public class HackerLand_Radio_Transmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {2,4,6,7,8,11,12};
		int k=2;
        int result = hackerlandRadioTransmitters(x, k);
        System.out.println(result);
	        

	}
	
	static int hackerlandRadioTransmitters(int[] x, int k) {
		Arrays.sort(x);
        int counter = 0;
        int i = 0;
        while (i < x.length) {
            
            int leftStartingPoint = i;
            while((i + 1 < x.length) && (x[i + 1] - x[leftStartingPoint] <= k)) { i++; }
            int middlePoint = i;
            while((i + 1 < x.length) && (x[i + 1] - x[middlePoint] <= k)) { i++; }
            i++;
            counter++;
        }

        return counter;
		 
    }

}
