package TBD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kth_Most_Freq_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		kthMostFreq("agcaabbbca",k);

	}
	
	public static void kthMostFreq(String str, int k) {
		 	 
	        HashMap<Character, Integer> counter = new HashMap<>();

	        for (char c: str.toCharArray()){
	            if (!counter.containsKey(c))
	            {
	                counter.put(c, 1);
	            }
	            else
	            {
	                counter.put(c, counter.get(c) + 1);
	            }
	        }

	        List<Map.Entry<Character, Integer>> list = new ArrayList<>(counter.entrySet());
	        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
	            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
	                return o2.getValue().compareTo(o1.getValue());
	            }
	        });
	        
	        System.out.println(list.get(k-1).getKey()+" --- "+list.get(k-1).getValue());
	}

}
