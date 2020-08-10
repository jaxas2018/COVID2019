package Tree;


public class Binary_Tree_Maximum_Path_Sum_124H {

	int max_Path_Sum=Integer.MIN_VALUE;
	
	public int maxPathSum(TreeNode root) {
        pathSum(root);
        return max_Path_Sum;
    }
	
	private int pathSum(TreeNode root) {
		if(root==null) return 0;
		int left=Math.max(0, pathSum(root.left));
		int right=Math.max(0, pathSum(root.right));
		
		max_Path_Sum=Math.max(max_Path_Sum, left+right+root.val);//Recording the maximum value for this node as root locally
		
		return Math.max(left, right)+root.val;//Return to the upper layer to decide whether left or right should be chosen
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
