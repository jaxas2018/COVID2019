
public class Sherlock_and_Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(squares(18,26));

	}
	
	 static int squares(int a, int b) {
		int numOfSquares = 0;
	    int x = 1;
	    while(x*x < a) x++;
	    while(x*x <= b){
	        numOfSquares++;
	        x++;
	    }
	    
	    
	    return numOfSquares;
	 }

}
