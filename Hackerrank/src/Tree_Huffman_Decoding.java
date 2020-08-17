   	
public class Tree_Huffman_Decoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void decode(String s, Node root) {
        
		 StringBuilder output = new StringBuilder();
	        Node base = root;
	        while (!s.isEmpty()){
	        if (s.charAt(0) == '1'){
	            base = base.right;
	            s = s.substring(1);
	        }
	        else {
	            base = base.left;
	            s = s.substring(1);
	        }
	        if (base.left == null && base.right == null){
	            output.append(base.data);
	            base = root;
	            }
	        }
	        System.out.println(output.toString());  
	       
    }
	
	class Node{
		public  int frequency; // the frequency of this tree
		public  char data;
		public  Node left, right;
		
		public Node(int frequency,char data) {
			this.frequency=frequency;
			this.data=data;
		}
	}

}
