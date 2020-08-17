package Java8;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		System.out.println(fact(n));

	}

	private static long fact(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1) return 1;
		
		return n*fact(n-1);
		
	}

}
