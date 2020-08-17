import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int lastAns=0;
		int nS=scan.nextInt();//sequence
		int nQ=scan.nextInt();//queries
		int type,x,y,index;
		
		ArrayList<Integer>[] seqList=new ArrayList[nS];
		
		//for each query
		while(nQ-->0) {
			//collect data for each row
			type=scan.nextInt();
			x=scan.nextInt();
			y=scan.nextInt();
			
			index=(x ^ lastAns) % nS;
			
			switch(type) {
			case 1:
				//if the index is null, create a new arrayllist and set seqList at the index to 
				//the new arraylist populated with value y
				if(seqList[index]==null) {
					ArrayList<Integer> myList=new ArrayList<>();
					myList.add(y);
					seqList[index]=myList;
				}else {//if it already exists, just add the y value
					seqList[index].add(y);
				}
				break;
				
			case 2:
				//find the value at (y%size) and set lastAns to it.Print the new lastAns on a new line
				System.out.println(lastAns=seqList[index].get(y % seqList[index].size()));
				break;
			
			}
		}

	}

}
