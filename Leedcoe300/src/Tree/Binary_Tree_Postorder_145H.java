package Tree;
 
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
 

public class Binary_Tree_Postorder_145H {
	
	 public static void main(String[] args) {
		TreeNode root = null;
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7); 
	  
	    List<Integer> list=postorderTraversal(root); 
	    for(Integer num: list) {
	    	System.out.print(num+" ");
	    }
	}

	 public static List<Integer> postorderTraversal(TreeNode root) {
		 	//use LinkedList addFirst method to add the last element in stack at the beginning of the list
	        LinkedList<Integer> list=new LinkedList<>();
			Stack<TreeNode> stack=new Stack<>();
			
			if(root==null) return list;
			
			stack.push(root);
			
			while(!stack.isEmpty()) {
				TreeNode curr=stack.pop();
				list.addFirst(curr.val);//1,2,3--->3,2,1
				 
				if(curr.left!=null) {
					stack.push(curr.left);	
				}
				if(curr.right!=null) {
					stack.push(curr.right);	
					 
				}			
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


