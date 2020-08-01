package Java8;

import java.util.HashMap;
import java.util.Map;

public class Beginner1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(5,"Five");
		map.put(2,"Two");
		map.put(8,"Eight");
		map.put(6,"Six");
		map.put(4,"Four");
		
		String text=map.get(6);
		System.out.println(text);
		
		for (int i =0; i<100;i++) {
			for (Map.Entry<Integer,String> entry:map.entrySet()) {
				int key= entry.getKey();
				String value= entry.getValue();
				System.out.println(key+","+value);
			}
			System.out.println("\n \n");
		}
	}
	
	
		 
}




