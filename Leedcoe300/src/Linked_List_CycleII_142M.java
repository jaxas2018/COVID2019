 

public class Linked_List_CycleII_142M {
	static ListNode head;
	
	public static void main(String[] args) {
		
		Linked_List_CycleII_142M llist = new Linked_List_CycleII_142M(); 

		llist.push(20); 
		llist.push(4); 
		llist.push(15); 
		llist.push(10); 
		llist.push(30);
		llist.push(8);

		/*Create loop for testing */
		head.next.next =head.next; 

		ListNode intersection=llist.detectCycle(head); 
		System.out.println("Intersection at "+intersection.val);
		
	}
	static class ListNode{
		int val;
		ListNode next;
		
		ListNode(int x){
			val=x;
			next=null;
		}
	}
	
	/* Inserts a new Node at front of the list. */
	public void push(int new_data) 
	{ 
		/* 1 & 2: Allocate the Node & 
				Put in the data*/
		ListNode new_node = new ListNode(new_data); 

		/* 3. Make next of new Node as head */
		new_node.next = head; 

		/* 4. Move the head to point to new Node */
		head = new_node; 
	} 
	 
	 public ListNode detectCycle(ListNode head) {
		 if(head==null) return null;
		 	
	        ListNode slow = head;
	        ListNode fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	            if (slow == fast) break;
	        }
	        
	        if(fast==null || fast.next==null) return null;
	        fast=head;
	        while(slow!=fast) {
	        	fast=fast.next;
	        	slow=slow.next;
	        }
	        return slow;
	    }
}
