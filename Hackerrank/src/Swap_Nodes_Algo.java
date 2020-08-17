import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//https://rusyasoft.github.io/competitive%20programming/2018/07/24/hrank-swapNodes/
public class Swap_Nodes_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] indexes= {{2,3},{4,-1},{5,-1},{6,-1},{7,8},{-1,9},{-1,-1},{10,11},{-1,-1},{-1,-1},{-1,-1}};
		int[] queries= {2,4};
		int[][] result=swapNodes(indexes,queries);
		
		for(int i=0;i<queries.length;i++) {
			for(int j=0;j<indexes.length;j++) {
				System.out.print(result[i][j]+" ");
				
			}
			System.out.println();
		}
		 

	}
	
	static class Node {
        int index;
        int depth;
        Node left;
        Node right;

        public Node(int index, int depth) {
            this.depth = depth;
            this.index = index;
          
        }
    }

    static void printInOrder(Node cur, List<Integer> result) {

        if (cur == null) {
            return ;
        }

        printInOrder(cur.left, result);
        //System.out.print(cur.index + " ");
        result.add(cur.index);
        printInOrder(cur.right, result);        
    }

    static void swapInOrder(Node cur, int depth, int k) {

        if (cur == null) {
            return ;
        }

        swapInOrder(cur.left, depth + 1, k);
        //System.out.print("cur.index: " + cur.index);
        swapInOrder(cur.right, depth + 1, k);

        if (depth >=k && depth % k == 0 ) {
            Node tmp = cur.left;
            cur.left = cur.right;
            cur.right = tmp;
        }

    }

    static int[][] swapNodes(int[][] indexes, int[] queries) {
        int numOfNodes = indexes.length;
        int numOfQueries = queries.length;
        int[][] result = new int[numOfQueries][numOfNodes];


        Node root = new Node(1, 1);
        Node cur = root;

        Queue<Node> nodes = new LinkedList<Node>();
        nodes.offer(cur);

        int N = 0; // = numOfNodes;
        while (N < numOfNodes) {
            cur = nodes.poll();
            int leftData = indexes[N][0];
            int rightData = indexes[N][1];
            //System.out.println("left,right: " + leftData + " " + rightData + " cur: "                + cur );
            cur.left = (leftData==-1)? null: new Node(leftData, cur.depth+1);
            cur.right = (rightData==-1)? null: new Node(rightData, cur.depth+1);

            if (cur.left != null && cur.left.index != -1) 
                nodes.offer(cur.left);
            if (cur.right != null && cur.right.index != -1) 
                nodes.offer(cur.right);

            N++;
        }

        //TODO: till here we have formed the tree, [not checked yet]
        for (int i = 0; i < numOfQueries; i++) {
            swapInOrder(root, 1, queries[i]);
            List<Integer> res = new ArrayList<>();
            printInOrder(root, res);
            result[i] = res.stream().mapToInt(r->r).toArray();
        }


        return result;
    }

}
