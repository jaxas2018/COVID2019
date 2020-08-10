package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

 
public class Binary_Tree_Inorder_94M {
	
	/*
	 * public List<Integer> inorderTraversal(TreeNode root) { List<Integer> list=new
	 * ArrayList<>(); if(root==null) return list; dfs(root,list);
	 * 
	 * return list;
	 * 
	 * }
	 * 
	 * private static void dfs(TreeNode root,List<Integer> list) { if(root==null)
	 * return; dfs(root.left,list); list.add(root.val); dfs(root.right,list); }
	 */
 	 
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list=new ArrayList<>();
		Stack<TreeNode> stack=new Stack<>();
		
		if(root==null) return list;
		
		TreeNode curr=root;
		
		while(curr!=null || !stack.isEmpty()) {
			while(curr!=null) {
				stack.push(curr);
				curr=curr.left;	
			}
			
			curr=stack.pop();
			list.add(curr.val);
			curr=curr.right;
		}
		
		return list;
        
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
