package Tree;

public class Insert_Into_BST_701M {

	public static void main(String[] args) {
		
	}
	public TreeNode insertIntoBST(TreeNode root, int val) {
		
		/* Recursion Method
		 
		 * if (root == null) { return new TreeNode(val); } if (root.val > val) {
		 * root.left = insertIntoBST(root.left, val); } else { root.right =
		 * insertIntoBST(root.right, val); } return root;
		 */
		
		
		if(root==null) return new TreeNode(val);
		
		TreeNode curr=root;
		while(curr!=null) {
			if(curr.val<val) {
				if(curr.right==null) {
					curr.right=new TreeNode(val);
					break;//Must add, otherwise over time
				}
				curr=curr.right;
			}else {
				if(curr.left==null) {
					curr.left=new TreeNode(val);
					break;//Must add, otherwise over time
				}
				curr=curr.left;
			}
			
			
		}
        return root;
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
