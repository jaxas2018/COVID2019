
public class Strong_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Aa9";
		System.out.println(minimumNumber(2,str));
	}
	
	static int minimumNumber(int n, String password) {
		 
		if(password==null ||password.trim().isEmpty()) return 6;
		
		boolean low=false,cap=false,dig=false,spe=false;
		
		String special_characters = "!@#$%^&*()-+";
		 
		for (int i = 0; i < n; i++) {
	         if (special_characters.contains(String.valueOf(password.charAt(i)))) {
	        	 spe=true; 
	         }else if(Character.isUpperCase(password.charAt(i))) {
	        	 cap=true;
	         }else if(Character.isLowerCase(password.charAt(i))) {
	        	 low=true;
	         }else if(Character.isDigit(password.charAt(i))) {
	        	 dig=true;
	         }     		  
	     }  
		
		int ans=0;
		if(!low) ans++;
		if(!cap) ans++;
		if(!dig) ans++;
		if(!spe) ans++;
		
		if((n+ans)<6) ans+=6-(n+ans);
		return ans;

	}
}
