package TBD;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class K_Closet_Points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[][] kClosest(int[][] points, int K) {
		
		PriorityQueue<int[]> maxHeap=new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
		for(int[] point:points) {
			maxHeap.offer(point);
			if(maxHeap.size()>K) {
				maxHeap.poll();
			}
		}
		
		int[][] result=new int[K][2];
		while(K-- >0) {
			result[K]=maxHeap.poll();
		}
		
		return result;
		 
	}

}
