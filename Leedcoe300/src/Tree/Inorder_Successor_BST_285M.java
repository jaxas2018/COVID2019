package Tree;

public class Inorder_Successor_BST_285M {}
/*
	public static void main(String[] args) { // TODO Auto-generated method stub

		int[] keys = { 15, 10, 20, 8, 12, 16, 25,18};

		TreeNode root = null;
		for (int key : keys) {
			root = insert(root, key);
		}
		
		// find in-order predecessor for each key
		 TreeNode nodeP=root.right.left.right;
			TreeNode succ = inorderSuccessor(root, nodeP);

		 System.out.println(succ.val);
}

	

		if (root == null)
			return null;

		if (p.right != null)
			return findMin(p.right);

		TreeNode succ = null;

		while (root != null) {
			if (root.val > p.val) {
				succ = root;
				root = root.left;
			} else if (p.val > root.val) {
				root = root.right;
			} else {
				return succ;
			}
		}
 
		return succ;
	}

	private static TreeNode findMin(TreeNode p) {
		if (p.left != null)
			p = p.left;

		return p;
	}
	
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
		
		

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}*/

//Java program to find minimum value node in Binary Search Tree 

//A binary tree node 
/*
 * class Node {
 * 
 * int data; Node left, right, parent;
 * 
 * Node(int d) { data = d; left = right = parent = null; } }
 * 
 * class BinaryTree {
 * 
 * static Node head;
 * 
 * Given a binary search tree and a number, inserts a new node with the given
 * number in the correct place in the tree. Returns the new root pointer which
 * the caller should then use (the standard trick to avoid using reference
 * parameters). Node insert(Node node, int data) {
 * 
 * 1. If the tree is empty, return a new, single node if (node == null) { return
 * (new Node(data)); } else {
 * 
 * Node temp = null;
 * 
 * 2. Otherwise, recur down the tree if (data <= node.data) { temp =
 * insert(node.left, data); node.left = temp; temp.parent = node;
 * 
 * } else { temp = insert(node.right, data); node.right = temp; temp.parent =
 * node; }
 * 
 * return the (unchanged) node pointer return node; } }
 * 
 * Node inOrderSuccessor(Node root, Node n) {
 * 
 * // step 1 of the above algorithm if (n.right != null) { return
 * minValue(n.right); }
 * 
 * // step 2 of the above algorithm Node p = n.parent; while (p != null && n ==
 * p.right) { n = p; p = p.parent; } return p; }
 * 
 * Given a non-empty binary search tree, return the minimum data value found in
 * that tree. Note that the entire tree does not need to be searched. Node
 * minValue(Node node) { Node current = node;
 * 
 * loop down to find the leftmost leaf while (current.left != null) { current =
 * current.left; } return current; }
 * 
 * // Driver program to test above functions public static void main(String[]
 * args) { BinaryTree tree = new BinaryTree(); Node root = null, temp = null,
 * suc = null, min = null; root = tree.insert(root, 20); root =
 * tree.insert(root, 8); root = tree.insert(root, 22); root = tree.insert(root,
 * 4); root = tree.insert(root, 12); root = tree.insert(root, 10); root =
 * tree.insert(root, 14); temp = root.left.right.right; suc =
 * tree.inOrderSuccessor(root, temp); if (suc != null) {
 * System.out.println("Inorder successor of " + temp.data + " is " + suc.data);
 * } else { System.out.println("Inorder successor does not exist"); } } }
 * 
 * //This code has been contributed by Mayank Jaiswal
 */