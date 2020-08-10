
public class TowerOfHanoi {
	static long count=0;
	 
	public static void main(String[] args) {
		 int nDisks=3;
		 String StepsToSolution =hanoi(nDisks,1,3);
		  
		 for(int i=0;i<StepsToSolution.length();i++){
			 if(StepsToSolution.charAt(i)==';'){
				 count++;
			 }
		 }
		  
			 System.out.println(StepsToSolution);
			 System.out.println("Total Times: "+count);

	}
	
	public static String hanoi(int nDisks,int fromPeg, int toPeg){
		if(nDisks==1){
			return fromPeg+ " -> "+toPeg+";";
		}
		else{
			String sol1, sol2,sol3;
			int helpPeg=6 - fromPeg -toPeg;
			sol1=hanoi(nDisks-1,fromPeg, helpPeg);
		 
			sol2=fromPeg +" -> "+ toPeg +";";
			 
			sol3=hanoi(nDisks -1, helpPeg, toPeg);
			 
			
			return sol1 + sol2 + sol3;
			
			
		}
		 
	}
}

