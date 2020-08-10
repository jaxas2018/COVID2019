package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Deepest_Leaves_Sum_1302M {
	
	 public int deepestLeavesSum(TreeNode root) {
	    
		 Queue<TreeNode> q = new LinkedList<>();
	        q.offer(root);
	        int res = 0;
	        
	        while (!q.isEmpty()) {
	            int n = q.size();
	            res = 0;
	            
	            for(int i=0;i<n;i++) {
	                TreeNode cur = q.poll();
	                res += cur.val;
	                if (cur.right != null) q.offer(cur.right);
	                if (cur.left != null) q.offer(cur.left); 
	            }
	        }
	        return res;
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
