package Tree;

 

public class Validate_BST_98M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isValidBST(TreeNode root) {
	    if(root==null) return true;
	    
	    while(root!=null) {
	    	if(root.left!=null && root.right!=null) {
	    		if(root.left.val < root.val && root.val>root.right.val) return true;
	    	}else if(root.left!=null) {
	    		if(root.left.val<root.val) return true;
	    	}else if(root.right!=null) {
	    		if(root.right.val>root.val) return true;
	    	}
	    	
	    }
		return false;
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
