import java.util.ArrayList;
import java.util.List;

public class Diagonal_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> aList= new ArrayList<>();
	     
 
       // Create n lists one by one and append to the  
       // master list (ArrayList of ArrayList) 
       ArrayList<Integer> a1 = new ArrayList<Integer>(); 
       a1.add(11); 
       a1.add(2); 
       a1.add(4); 
       aList.add(a1); 
 
       ArrayList<Integer> a2 = new ArrayList<Integer>(); 
       a1.add(4); 
       a1.add(5); 
       a1.add(6); 
       aList.add(a2); 
 
       ArrayList<Integer> a3 = new ArrayList<Integer>(); 
       a3.add(10); 
       a3.add(8); 
       a3.add(-12); 
       aList.add(a3); 
       
       System.out.println(diagonalDifference(aList));
       
	}
	
	 public static int diagonalDifference(List<List<Integer>> arr) {
		    // Write your code here
		    int row=arr.size();
		    int sum_left=0,sum_right=0;
		    for(int i=0;i<row;i++) {
		    	sum_left+=arr.get(i).get(i);
		    	sum_right+=arr.get(i).get(row-1-i);
		    }
		    
		    return Math.abs(sum_left-sum_right);

    }

}
