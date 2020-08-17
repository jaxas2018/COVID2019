import java.math.BigInteger;

public class Extra_Long_Factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extraLongFactorials(25);
	}
	
	static void extraLongFactorials(int n) {
		
		BigInteger temp=new BigInteger("1");
		for(int i=1;i<=n;i++) {
			temp=temp.multiply(BigInteger.valueOf(i));
			
		}
		
		System.out.println(temp);
	}

}
