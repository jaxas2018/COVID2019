

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_K_Freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<String> topKFrequent(String[] words,int k){
		
		Map<String, Integer> map=new HashMap<>();
		for(String word:words) {
			map.put(word,map.getOrDefault(word, 0)+1);
		}
		
		PriorityQueue<String> pq=new PriorityQueue<>(new Comparator<String>() {

			@Override
			public int compare(String word1, String word2) {
				// TODO Auto-generated method stub
				int frequency1=map.get(word1);
				int frequency2=map.get(word2);
				if(frequency1==frequency2) {
					return word2.compareTo(word1);
				}
				
				return frequency1 -frequency2;
			}
			
		});
		
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			pq.add(entry.getKey());
			if(pq.size() > k) pq.poll();
		}
		
		List<String> result=new ArrayList<>();
		while(!pq.isEmpty()) {
			result.add(pq.poll());
		}
		
		Collections.reverse(result);
		
		return result;
		
	}
	
	public int[] topKFrequent(int[] nums, int k) {
	    //count the frequency for each element
		HashMap<Integer, Integer> map = new HashMap<>();
	    for (int num : nums) {
	        map.put(num, map.getOrDefault(num, 0) + 1);
	    }
	 
	    // create a min heap
	    PriorityQueue<Map.Entry<Integer, Integer>> queue 
	                  = new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));
	 
	    //maintain a heap of size k.
	    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	        queue.offer(entry);
	        if (queue.size() > k) {
	            queue.poll();
	        }
	    }
	 
	    //get all elements from the heap
	    List<Integer> result = new ArrayList<>();
	    while (queue.size() > 0) {
	        result.add(queue.poll().getKey());
	    }
	 
	    //reverse the order
	    Collections.reverse(result);
        
        int[] res = new int[result.size()]; 
        for(int i=0;i<result.size();i++){
            res[i]=result.get(i);
        }
	 
	    return res;
        
	}
	
	public int[] topKFrequent1(int[] nums, int k) {
		
		Map<Integer, Integer> map=new HashMap<>();
		for(Integer num:nums) {
			map.put(num,map.getOrDefault(num, 0)+1);
		}
		
		PriorityQueue<Map.Entry<Integer, Integer>> pq=new PriorityQueue<>(Comparator.comparing(e->e.getValue()));
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			pq.offer(entry);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		
		List<Integer> list=new ArrayList<>();
		while(!pq.isEmpty()) {
			list.add(pq.poll().getValue());
		}
		
		Collections.reverse(list);
		int[] res=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			res[i]=list.get(i);
		}
		
		return res;
	}
	
	

}
