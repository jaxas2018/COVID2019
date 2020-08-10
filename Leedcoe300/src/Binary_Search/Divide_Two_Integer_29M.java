package Binary_Search;

public class Divide_Two_Integer_29M {

	public static void main(String[] args) {
		int num1=37;
		int num2=3;
		int result=divide(num1,num2);
		System.out.println(result);
		 
		 
	}
	
	private static int divide(int dividend, int divisor) {
        if (divisor == 1) {
            return dividend;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MAX_VALUE && divisor == -1) {
            return Integer.MIN_VALUE;
        }
        int result = 0;
		/*
		 * int a1 = Math.abs(dividend); int a2 = Math.abs(divisor); while (a1 - a2 >= 0)
		 * { int pow = 0; while (a1 - (a2 << 1 << pow) >= 0) { pow++; } result =
		 * result+(1 << pow); a1 =a1-(a2 << pow); } return (dividend >= 0) == (divisor >
		 * 0) ? result : -result;
		 */
        
        int a1=Math.abs(dividend);
        int a2=Math.abs(divisor);
        while(a1-a2>=0) {
        	int pow=0;
        	while(a1-(a2<<1<<pow)>=0) {
        		pow++;
        	}
        	result=result+(1<<pow);
        	a1=a1-(a2<<pow);
        	
        	
        }
        
        return (dividend<0)==(divisor<0)?result:-result;
    }

}


 
