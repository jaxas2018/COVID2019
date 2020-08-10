package Binary_Search;

/*import java.util.LinkedList;
import java.util.Queue;*/

public class Kth_Smallest_BST_230M {
	private int count=0;
	private int result=0;
	public static void main(String[] args) {
		
	}
	
	public int kthSmallet(TreeNode root, int k) {
		/*
		 * Queue<Integer> q=new LinkedList<>(); dfs(root,q);
		 * 
		 * for(int i=0;i<k-1;i++) { q.poll(); } return q.poll();
		 */
		count=k;
		dfs(root);
		return result;
	}
	
	 

	private void dfs(TreeNode root) {
		if(root.left!=null) dfs(root.left);
		count--;
		if(count==0) {
			result=root.val;
			return;
		}
		if(root.right!=null) dfs(root.right);
		
	}



	/*
	 * private void dfs(TreeNode root, Queue<Integer> q) {
	 * 
	 * if(root==null) return; dfs(root.left,q); q.offer(root.val);
	 * dfs(root.right,q);
	 * 
	 * 
	 * }
	 */



	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int val) {
			this.val=val;
		}
	}

}
