
public class Is_This_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	boolean checkBST(Node root) {
	       return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE); 
	}
	
	private boolean checkBST(Node root, int left, int right){
        if(root == null) return true;
        if(root.data >= right || left >= root.data) return false;
        return checkBST(root.left, left, root.data) && checkBST(root.right, root.data, right);
	}

}
