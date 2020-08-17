package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Word_Ladder_127M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beginWord="hit";
		String endWord="cog";
		
		List<String> wordList=Arrays.asList("hot","dot","dog","lot","log","cog");
		int res=ladderLength(beginWord,endWord,wordList);
		System.out.println(res);

	}
	
	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Queue<String> queue=new LinkedList<>();
        queue.offer(beginWord);
        int level=1;
        
        while(!queue.isEmpty()) {
        	int size=queue.size();
        	for(int i=0;i<size;i++) {
        		String curr_word=queue.poll();
        		char[] word_chars=curr_word.toCharArray();
        		
        		for(int j=0;j<word_chars.length;j++) {
        			char original=word_chars[j];
        			
        			for(char c='a';c<='z';c++) {
        				if(word_chars[j]==c) continue;
        				word_chars[j]=c;
        				
        				String new_word=String.copyValueOf(word_chars);
        				if(new_word.equals(endWord)) return level+1;
        				
        				if(wordList.contains(new_word)) {
        					queue.offer(new_word);
        					wordList.remove(new_word);
        				}
        				
        				
        			}
        			
        			word_chars[j]=original;
        		}
        	}
        	level++;
        }
		return 0;
    }

}
