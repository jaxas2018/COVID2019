package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
    
public class N_ary_Tree_Level_Order_429M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<List<Integer>> levelOrder(Node root){
	 List<List<Integer>> result = new ArrayList<>();
     if (root == null) {
       return result;
     }
     Queue<Node> queue = new LinkedList<>();
     queue.offer(root);
     while (!queue.isEmpty()) {
       int size = queue.size();
       List<Integer> level = new ArrayList<>();
         
       for (int i = 0; i < size; i++) {
         Node currentNode = queue.poll();
          
           level.add(currentNode.val);
					 
           for(Node child:currentNode.children) {
        	   queue.offer(child);
           }
         
       }
       result.add(level);
     }
     return result;

}
	 
	 static class Node {
		    public int val;
		    public List<Node> children;

		    public Node() {}

		    public Node(int _val) {
		        val = _val;
		}
		    
	 }
}
