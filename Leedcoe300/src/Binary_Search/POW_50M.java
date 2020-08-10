package Binary_Search;

public class POW_50M {


	public static void main(String[] args) {
		double num=2.0;
		int n=-5;
		double result=power(num,n);
		System.out.println(result);
		
	}
		


	public static double power(double x, int n) 
	{ 
	     
	    if( n == 0) 
	        return 1; 
	    double temp = power(x, n/2);  
	      
	    if (n%2 == 0) 
	        return temp*temp; 
	    else
	    { 
	        if(n > 0) 
	            return x * temp * temp; 
	        else
	            return (temp * temp) / x; 
	    } 
	    
	}
}
