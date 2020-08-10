package Tree;
/*
 * Time complexity: o(n)
 * Space complexity: o(1)
 * 
 */
class TreeNode{
	int val;
	TreeNode left = null, right = null;

	TreeNode(int x) {
		val = x;
	}
}

public class Inorder_Predecessor_BST{
	// Recursive function to insert an key into BST
	public static TreeNode insert(TreeNode root, int key){
		// if the root is null, create a new node an return it
		if (root == null) {
			return new TreeNode(key);
		}

		// if given key is less than the root node, recur for left subtree
		if (key < root.val) {
			root.left = insert(root.left, key);
		}

		// if given key is more than the root node, recur for right subtree
		else {
			root.right = insert(root.right, key);
		}

		return root;
	}

	// Helper function to find maximum value node in given BST
	public static TreeNode findMaximum(TreeNode root) {
		while (root.right != null) {
			root = root.right;
		}

		return root;
	}

	// Recursive function to find in-order predecessor for given key in a BST
	public static TreeNode findPredecessor(TreeNode root, TreeNode prec, int key)
	{
		// base case
		if (root == null) {
			return prec;
		}

		// if node with key's value is found, the predecessor is maximum
		// value node in its left subtree (if any)
		if (root.val == key) {
			if (root.left != null) {
				return findMaximum(root.left);
			}
		}

		// if given key is less than the root node, recur for left subtree
		else if (key < root.val) {
			return findPredecessor(root.left, prec, key);
		}

		// if given key is more than the root node, recur for right subtree
		else {
			// update predecessor to current node before recursing 
			// in right subtree
			prec = root;
			return findPredecessor(root.right, prec, key);
		}
		return prec;
	}

	// main function
	public static void main(String[] args)
	{
		/* Construct below tree
				   15
				 /	\
				/	  \
			   10	   20
			  /  \	 /  \
			 /	\   /	\
			8	 12 16	25
		*/

		int[] keys = { 15, 10, 20, 8, 12, 16, 25,18};

		TreeNode root = null;
		for (int key : keys) {
			root = insert(root, key);
		}

		// find in-order predecessor for each key
		for (int key : keys)
		{
			TreeNode prec = findPredecessor(root, null, key);

			if (prec != null) {
				System.out.println("Predecessor of node " + key + " is "
									+ prec.val);
			} else {
				System.out.println("Predecessor doesn't exists for node "
									+ key);
			}
		}
	}
}


/*


public static Node predecessor(Node root, Node node) {
	 
	if (node.left != null)
		return max(node.left);

	// Example 1 or Example 2
	Node predecessor = null;
	// Start from root and search for predecessor down the tree
	
	while (root != null) {
	
		if (node.data == root.data) {
			// by now we might found our predecessor
			break;
		} else if (node.data < root.data) {
			root = root.left;
		} else if (node.data > root.data) {
			predecessor = root;
			root = root.right;
		}
	}
	return predecessor;
}

*/


