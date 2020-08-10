package TBD;

import java.util.Arrays;
import java.util.Collections;

public class Maximum_Ballon_1189E {

	public static void main(String[] args) {
		String text="ball0on";
		int num=maxNumberOfBalloons(text);
		System.out.println(num);
		 
	}
	
	public static int maxNumberOfBalloons(String text) {
		/*
		int[] char_counts =new int[26];
		for(int i=0;i<text.length();i++) {
			char_counts[text.charAt(i)-'a']++;
		}
		int min=char_counts[1];
		 
		min=Math.min(min, char_counts[0]);
		min=Math.min(min, char_counts[11]/2);
		min=Math.min(min, char_counts[14]/2);
		min=Math.min(min, char_counts[13]);*/
		 
		int c1=0,c2=0,c3=0,c4=0,c5=0;
		
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)=='b') {
				 
				c1++;
			}
			if(text.charAt(i)=='a') {
				 
				c2++;
			}
			if(text.charAt(i)=='l') {
				 
				c3++;
			}
			if(text.charAt(i)=='o') {
				 
				c4++;
			}
			if(text.charAt(i)=='n') {
				 
				c5++;
			}
			
		}
		 
		int min=Collections.min(Arrays.asList(c1,c2,c3/2,c4/2,c5));
		return min;
		 
		 
	}

}
