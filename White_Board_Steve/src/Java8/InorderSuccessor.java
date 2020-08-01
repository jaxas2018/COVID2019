package Java8;
 

public class InorderSuccessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
		
		if(root == null) {
			return null;
		}
		
		if(root.left != null) {
			return findGreatest(root.left);
		}
		
		TreeNode suc = null;
		while(root != null) {
			if(root.val > p.val) {
				root = root.left;
			}else if(root.val < p.val) {
				suc = root;
				root = root.right;
			}else {
				return suc;
			}
		}
		
		return suc;
	}
	
	public static TreeNode findGreatest(TreeNode root) {
		
		while(root.right != null) {
			root = root.right;
		}
		
		return root;
	}
	
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
