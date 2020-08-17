
public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="appleTheBestNew";
		System.out.println(camelCase(str));

	}
	
	static int camelCase(String s) {
        int count=0;

        for(int i=0; i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                count++;
            }
        }
        return count+1;
    }

}
