import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
//https://www.hackerrank.com/challenges/tree-top-view/forum/comments/497174
class Node {
  Node left;
  Node right;
  int data;
  int height;
}

public class TopView_Tree{
	
	static class QueueNode{
	    Node node;
	    int level;
	    public QueueNode(Node node, int level){
	        this.node = node;
	        this.level = level;
	    }
	}

	public static void topView(Node root) {
    
    Queue<QueueNode> queue = new LinkedList<QueueNode>();
   
    TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
 
    queue.add(new QueueNode(root, 0));
    
    while(!queue.isEmpty()){
         
        QueueNode r = queue.poll();
        
         
        if(!map.containsKey(r.level)){
            map.put(r.level, r.node.data);
        }
        
        if(r.node.left != null){
            queue.offer(new QueueNode(r.node.left, r.level - 1));
        }
        if(r.node.right != null){
            queue.offer(new QueueNode(r.node.right, r.level + 1));
        }
    }
  
    for (Integer value : map.values()) {
        System.out.print(value + " ");
    }
    
	}
}

