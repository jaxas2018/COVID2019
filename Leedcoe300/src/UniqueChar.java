
public class UniqueChar {

	public static void main(String[] args) {
		String str="abcafkn";
		boolean res=uniqueCharacters(str);
		System.out.println(res);

	}
	
	 static boolean uniqueCharacters(String str) {
		 
		 boolean[] bool=new boolean[1024];
		 
		 for(int i=0;i<str.length();i++) {
			 int index=(int)str.charAt(i);
			 if(bool[index]==true) return false;
			 
			 bool[index]=true;
		 }
		 return true;
	 }

}
