package Tree;

public class Lowest_Common_Ancestor_Deepest_Leaves_1123M {
	
	public TreeNode lcaDeepestLeaves(TreeNode root) {
		if(root == null){
			return null;
		}

		int left = height(root.left);
		int right = height(root.right);
		if(left == right){
			return root;
		}else if(left > right){
			return lcaDeepestLeaves(root.left);
		}else{
			return lcaDeepestLeaves(root.right);
		}
	}

	private int height(TreeNode root){
		if(root == null){
			return 0;
		}
		return 1 + Math.max(height(root.left), height(root.right));
	}
	
	static class TreeNode {
	     int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}

}
