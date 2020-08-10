package Tree;
 
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
 

public class Binary_Tree_Postorder_145H {

	 public List<Integer> postorderTraversal(TreeNode root) {
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


