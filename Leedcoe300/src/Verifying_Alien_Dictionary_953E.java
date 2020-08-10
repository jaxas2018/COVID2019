import java.util.HashMap;
import java.util.Map;

public class Verifying_Alien_Dictionary_953E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"appa","apple"};
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		Verifying_Alien_Dictionary_953E vad=new Verifying_Alien_Dictionary_953E();
		boolean res=vad.isAlienSorted(words, order);
		System.out.println(res);

	}
	
	public boolean isAlienSorted(String[] words, String order) {
		Map<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<order.length();i++) {
			map.put(order.charAt(i), i);
		}
		
		for(int i=0;i<words.length-1;i++) {
			if(!inorder1(words[i],words[i+1],map)) {
				return false;
			}
		}
		return true;
	}

	public boolean inorder(String w1, String w2, Map<Character, Integer> map) {
		for(int i=0;i<w1.length() && i<w2.length();i++) {
			char ch1=w1.charAt(i);
			char ch2=w2.charAt(i);
			int idx1=map.get(ch1);
			int idx2=map.get(ch2);
			
			if(idx1 < idx2) {
				return true;
			}else if(idx1 > idx2) {
				return false;
			}	
		}
		return w1.length()<=w2.length();
	}
	
	public boolean inorder1(String w1,String w2, Map<Character,Integer> map) {
		
		for(int i=0;i<w1.length() && i<w2.length();i++) {
			char ch1=w1.charAt(i);
			char ch2=w2.charAt(i);
			int idx1=map.get(ch1);
			int idx2=map.get(ch2);
			
			if(idx1 < idx2) {
				return true;
			}else if(idx1 > idx2) {
				return false;
			}	
		}
		return w1.length()<=w2.length();
	}

}


