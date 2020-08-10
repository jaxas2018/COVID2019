package TBD;

public class Swap_Nodes_In_Pairs_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode swapPairs(ListNode head) {
		ListNode dummy=new ListNode(0);
		dummy.next=head;
		ListNode current=dummy;
		
		while(current.next!=null && current.next.next!=null) {
			swap(current);
			current=current.next.next;
		}
		
		return dummy.next;
	}
	
	private void swap(ListNode current) {
		// TODO Auto-generated method stub
		ListNode dummy=current.next;
		current.next=dummy.next;
		dummy.next=dummy.next.next;
		current.next.next=dummy;
		
	}

	static class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

}
