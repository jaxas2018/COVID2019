package Tree;


public class Recover_BST_99M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void recoverTree(TreeNode root) {
		
		TreeNode first=null;
		TreeNode second=null;
		boolean firstTime=true;
		TreeNode start=new TreeNode(Integer.MIN_VALUE);
		//Morris traversal 
		while(root!=null) {
			
			if(root.left!=null) {
				TreeNode prev=root.left;
				while(prev.right!=null && prev.right!=root) {
					prev=prev.right;
				}
				if(prev.right==null) {
					prev.right=root;
					root=root.left;
				}else {
					prev.right=null;
					//visit root.val
					
					if(start.val >root.val && firstTime) {
						first=start;
						firstTime=false;
					}
					if(start.val >root.val && !firstTime) {
						second=root;
					}	
					start=root;//end
					
					root=root.right;
				}
			}else {
				//visited root.val
				if(start.val >root.val && firstTime) {
					first=start;
					firstTime=false;
				}
				if(start.val >root.val && !firstTime) {
					second=root;
				}	
				start=root;//end
				
				
				
				root=root.right;
			}
		}
		//Swap these 2 node's value to restore correct BST
		if(first!=null && second!=null) {
			int temp=first.val;
			first.val=second.val;
			second.val=temp;
			
		}
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
