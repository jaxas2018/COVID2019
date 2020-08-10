package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_OrderII_107E {

	 public List<List<Integer>> levelOrder(TreeNode root) {
		 
		 List<List<Integer>> result=new ArrayList<>();
			
		 if(root==null) return result; 
		 
		 Queue<TreeNode> queue=new LinkedList<>();
		 
		 queue.offer(root);
		 
		 while(!queue.isEmpty()) {
			 int levelSize=queue.size();
			 List<Integer> levelList=new ArrayList<>();
			 for(int i=0;i<levelSize;i++) {
				 TreeNode temp=queue.poll();
				 levelList.add(temp.val);
				 if(temp.left!=null) queue.offer(temp.left);
				 if(temp.right!=null) queue.offer(temp.right);
				 
			 }
			 
			 result.add(0,levelList);
			 
		 }
		 
		 return result;
	 }
	
	
	
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int x){
			val=x;
		}
	}
}
