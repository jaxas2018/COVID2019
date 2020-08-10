package DynamicProgramming;

public class Fibonacci_DP {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fib(n));

	}

	
	static int fib(int n) 
    { 
    /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0 
    int i; 
       
    /* 0th and 1st number of the series are 0 and 1*/
     
    if(n==1) return 0;
    if(n==2) return 1;
    
    f[0] = 0; 
    f[1] = 1;
      
    for (i = 2; i <= n+1; i++) 
    { 
       /* Add the previous 2 numbers in the series 
         and store it */
        f[i] = f[i-1] + f[i-2]; 
    } 
       
    return f[n]; 
    } 
	/*

	public static int fib(int n) {
		int a = 0, b = 1, c = 1;
		if (n == 1)
			return a;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return a;
	}*/
	
	
}
