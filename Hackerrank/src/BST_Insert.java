
/* Node is defined as :*/
 
public class BST_Insert{
	public static Node insert(Node root,int data) {
          
    Node newNode=new Node(data);
    if (root == null) return newNode;
     
    /* Iteratively walk tree and insert new Node */
    Node curr = root;
    while (true) {
        if (data <= curr.data) {
            if (curr.left == null) {
                curr.left = newNode;
                return root;
            } else {
                curr = curr.left;
            }
        } else {
            if (curr.right == null) {
                curr.right = newNode;
                return root;
            } else {
                curr = curr.right;
            }
        }
    }
    	
    }
	
	static class Node {
	    int data;
	    Node left;
	    Node right;
	    
	    public Node(int data) {
	    	this.data=data;
	    }
	 }
}
