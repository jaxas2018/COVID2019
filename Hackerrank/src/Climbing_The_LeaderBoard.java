import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Climbing_The_LeaderBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores= {100,100,50,40,40,20,10};
		int[] alice= {5,25,50,120};
		
		int[] res=climbingLeaderboard(scores,alice);
		for(int num:res) {
			System.out.println(num);
		}

	}
	
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		/*
		 * int scoresLength = scores.length; int aliceLength = alice.length;
		 * 
		 * int[] aliceRank = new int[aliceLength];
		 * 
		 * HashSet<Integer> scoresSet = new HashSet<Integer>();
		 * 
		 * for (int i = 0; i < scoresLength; i++) { scoresSet.add(scores[i]); }
		 * 
		 * List<Integer> scoresList = new ArrayList<Integer>(scoresSet);
		 * Collections.sort(scoresList); Collections.reverse(scoresList);
		 * 
		 * int i = scoresList.size() - 1; int aliceIndex = 0;
		 * 
		 * for (int aliceScore : alice) { while (i >= 0) { if (aliceScore <
		 * scoresList.get(i)) { aliceRank[aliceIndex] = i + 2; aliceIndex++; break; }
		 * 
		 * i--; } if (i < 0) { // if true, each remaining aliceScore is highest score
		 * aliceRank[aliceIndex] = 1; aliceIndex++; } }
		 * 
		 * return aliceRank;
		 */
		
		int scoresLength=scores.length;
		int aliceLength=alice.length;
		
		int[] rank=new int[scoresLength];
		rank[0]=1;
		
		for(int i=1;i<scoresLength;i++) {
			if(scores[i]==scores[i-1]) rank[i]=rank[i-1];
			else rank[i]=rank[i-1]+1;
		}
		
		int[] res=new int[aliceLength];
		for(int i=0;i<aliceLength;i++) {
			int aliceScore=alice[i];
			if(alice[i]>=scores[0]) res[i]=1;
			else if(alice[i]<scores[scoresLength-1]) res[i]=rank[scoresLength-1]+1;
			else {
				int index=binarySearch(scores,aliceScore);
				res[i]=rank[index];
			}
		}
		
		return res;
 
    }

	private static int binarySearch(int[] scores, int key) {
		// TODO Auto-generated method stub
		
		int lo=0;
		int hi=scores.length-1;
		
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(key==scores[mid]) {
				return mid;
			}else if(key>scores[mid] && key <scores[mid-1]) {
				return mid;
			}else if(key <scores[mid] && key >scores[mid+1]) {
				return mid+1;
			}else if(key >scores[mid]) {
				hi=mid-1;
			}else if(key <scores[mid]) {
				lo=mid+1;
			}
		}
		return 0;
	}
	
	

}
