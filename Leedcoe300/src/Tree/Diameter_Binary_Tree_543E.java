package Tree;
 
public class Diameter_Binary_Tree_543E {

	private int diameterMax=0;
	public int diameterOfBinaryTree(TreeNode root) {
		findMaxPath(root);
		return diameterMax;
    }
	
	private int findMaxPath(TreeNode root) {
		if(root==null)return 0;

        int left = findMaxPath(root.left);
        int right = findMaxPath(root.right);
        
        diameterMax = Math.max(diameterMax,left+right);
        
        // Value that can be used by parent
        return Math.max(left,right)+1;
		
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
