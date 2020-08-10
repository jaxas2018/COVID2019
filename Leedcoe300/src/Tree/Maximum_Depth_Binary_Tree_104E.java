package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maximum_Depth_Binary_Tree_104E {

	int count=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxDepth(TreeNode root) {
	
		if(root==null) return 0;
		 
		int left=maxDepth(root.left);
		int right=maxDepth(root.right);
		
		return Math.max(left, right)+1;
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
