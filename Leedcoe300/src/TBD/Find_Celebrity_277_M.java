package TBD;

public class Find_Celebrity_277_M {

	public static void main(String[] args) {
		

	}
	
	public int findCelebrity(int n) {
        int candidate=0;
		for(int i=1;i<n;i++) {
			if(knows(candidate,i)) {
				candidate=i;
			}
		}
		
		for(int i=0;i<n;i++) {
			if(i==candidate) {
				continue;
			}
			if(knows(candidate,i)||!knows(i,candidate)) {
				return -1;
			}
		}
		
		return candidate;  
    }
	
	public boolean knows(int a,int b) {
		return false;
	}

}
