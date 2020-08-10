package Tree;


public class Longest_Univalue_Path_687E {

	 private int max_length=0;
	 public int longestUnivaluePath(TreeNode root) {
		 findMaxPath(root);
		 return max_length;
	        
	 }
	 
	 private int findMaxPath(TreeNode root) {
		if(root==null) return 0;
		
		int leftCount=findMaxPath(root.left);
		int rightCount=findMaxPath(root.right);
		
		int left=0;
		int right=0;
		
		if(root.left!=null && root.left.val==root.val) {
			left=leftCount+1;
		}
		if(root.right!=null && root.right.val==root.val) {
			right=rightCount+1;
		}
		max_length=Math.max(max_length,left+right);
		
		return Math.max(left, right);
		
	}

	static class TreeNode { 
			int val; 
			TreeNode left, right; 
			
			// constructor 
			TreeNode(int val){ 
				this.val = val; 
				left = null; 
				right = null; 
			} 
		} 
}
