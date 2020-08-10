package Tree;
/*
Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

For example, given

preorder = [3,9,20,15,7]
inorder = [9,3,15,20,7]
Return the following binary tree:

    3
   / \
  9  20
    /  \
   15   7
   */


public class Construct_From_Preorder_Inorder_105M {

	public TreeNode buildTree(int[] preorder, int[] inorder) {
	    int preStart = 0;
	    int preEnd = preorder.length-1;
	    int inStart = 0;
	    int inEnd = inorder.length-1;
	 
	    return construct(preorder, preStart, preEnd, inorder, inStart, inEnd);
	}
	 
	public TreeNode construct(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
	    if(preStart>preEnd||inStart>inEnd){
	        return null;
	    }
	 
	    int val = preorder[preStart];
	    TreeNode p = new TreeNode(val);
	 
	    //find parent element index from inorder
	    int k=0;
	    for(int i=inStart; i<inEnd; i++){
	        if(val == inorder[i]){
	            k=i;
	            break;
	        }
	    }
	 //From Inorder point of view, the left of Root: k-instart, plus the root, then all are right of root
	    p.left = construct(preorder, preStart+1, preStart+(k-inStart), inorder, inStart, k-1);
	    p.right= construct(preorder, preStart+(k-inStart)+1, preEnd, inorder, k+1 , inEnd);
	 
	    return p;
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
