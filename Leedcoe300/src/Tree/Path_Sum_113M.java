package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
 

public class Path_Sum_113M {
	static TreeNode root; 
	static TreeNode temp = root; 
	/*
	 * public List<List<Integer>> pathSum(TreeNode root, int sum) {
	 * List<List<Integer>> paths=new ArrayList<>(); List<Integer> list=new
	 * ArrayList<>(); findPaths(root,sum,list,paths); return paths; }
	 */
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		 List<List<Integer>> paths=new ArrayList<>(); 
		 List<Integer> list=new ArrayList<>(); 
		 find_Paths(root,sum,list,paths); 
		 return paths;
	}
	
	/*
	 * private void findPaths(TreeNode root, int sum, List<Integer> list,
	 * List<List<Integer>> paths) { if(root==null) return; list.add(root.val);
	 * 
	 * if(root.val==sum && root.left==null && root.right==null ) { paths.add(list);
	 * return; } //Need to create new instance of list, not the same list we have
	 * had before findPaths(root.left, sum-root.val,new
	 * ArrayList<Integer>(list),paths); findPaths(root.right, sum-root.val,new
	 * ArrayList<Integer>(list),paths);
	 * 
	 * 
	 * }
	 */
	
	private void find_Paths(TreeNode root, int sum, List<Integer> path, List<List<Integer>> paths) {
		 if(root==null) return;
		 sum-=root.val;
		 
		 
		 if(root.left==null && root.right==null ) {
			 if(sum==0) {
				path.add(root.val); 
				paths.add(new ArrayList<Integer>(path));
				path.remove(path.size()-1);
			 }
			  
			 return;
		 }
		 path.add(root.val);
		 find_Paths(root.left, sum,path,paths);
		 find_Paths(root.right, sum,path,paths);
		 path.remove(path.size()-1);
	 
		
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
		
		/* Inorder traversal of a binary tree*/
		static void inorder(TreeNode temp) 
		{ 
			if (temp == null) 
				return; 
		
			inorder(temp.left); 
			System.out.print(temp.val+" "); 
			inorder(temp.right); 
		} 
		
		/*function to insert element in binary tree */
		static void insert(TreeNode temp, int key) 
		{ 
			Queue<TreeNode> q = new LinkedList<TreeNode>(); 
			q.offer(temp); 
		
			// Do level order traversal until we find 
			// an empty place. 
			while (!q.isEmpty()) { 
				temp = q.peek(); 
				q.remove(); 
		
				if (temp.left == null) { 
					temp.left = new TreeNode(key); 
					break; 
				} else
					q.add(temp.left); 
		
				if (temp.right == null) { 
					temp.right = new TreeNode(key); 
					break; 
				} else
					q.add(temp.right); 
			} 
		} 
		
		// Driver code 
		public static void main(String args[]) 
		{ 
			
			root = new TreeNode(5); 
			root.left = new TreeNode(4); 
			root.left.left = new TreeNode(11); 
			root.left.right = new TreeNode(10); 
			root.left.right.right = new TreeNode(3);
			root.left.left.left = new TreeNode(7);
			root.left.left.right = new TreeNode(2);
			root.right = new TreeNode(8); 
			root.right.left = new TreeNode(13); 
			root.right.right = new TreeNode(4); 
			root.right.right.left = new TreeNode(5); 
			root.right.right.right = new TreeNode(1); 
		
			System.out.print( "Inorder traversal before insertion:"); 
			inorder(root); 
		
			System.out.println("\nPath Sum II reslt:");
			Path_Sum_113M test=new Path_Sum_113M();
			List<List<Integer>> result=test.pathSum(root, 22);
			System.out.println(result);
			 
		/*
		 * int key = 12; insert(root, key);
		 * 
		 * 
		 * System.out.print("\nInorder traversal after insertion:"); inorder(root);
		 */
		} 
	} 
 

	

