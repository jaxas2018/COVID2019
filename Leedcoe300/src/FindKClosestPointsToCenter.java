import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindKClosestPointsToCenter  {
	
	static class Point implements Comparator<Point>  {	
		int x;
		int y;
		
	    public Point() {}
	    
		public Point(int x1, int y1) {
	    	x = x1;
	    	y = y1;
	    }   
	    
	    
		 @Override
		    public String toString() {
		        return "(" + x + ", " + y + ")";
		    }

		@Override
		public int compare(Point p1, Point p2) {
			// TODO Auto-generated method stub
			return (p2.x * p2.x + p2.y * p2.y)-(p1.x * p1.x + p1.y * p1.y);
		}  
	}
 
	//Use PriorityQueue, Time O(nlogn), Space O(n)
	public static List<Point> findKClosestPoints(Point[] points,  int k) {
		int n = points.length;			
		PriorityQueue<Point> pq = new PriorityQueue<>(new Point());
		for (int i = 0; i < n; i++)
			pq.add(points[i]);
		
		List<Point> res = new ArrayList<>();
	    for (int i = 0;i < k; i++)
	    	res.add(pq.remove());
        return res;
	}
 
    public static void main(String[] args) throws Exception {                       	   
    	Point[] points = {new Point(1, 5), new Point( 3,2), new Point(9, 5), new Point(12, 4),new Point(3, 3) ,new Point(15, 5),
    			new Point(1, 1),new Point(2, 2)};   
        int k = 4;
        System.out.println("Cloest " + k + " points:"+ findKClosestPoints(points, k));             
    }
}
