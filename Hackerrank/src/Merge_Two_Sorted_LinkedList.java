
public class Merge_Two_Sorted_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1,SinglyLinkedListNode head2) {
		
		if(head1==null) return head2;
		else if(head2==null) return head1;
		
		SinglyLinkedListNode head3=null;
		
		if(head1.data<head2.data) {
			head3=head1;
			head1=head1.next;
		}else {
			head3=head2;
			head2=head2.next;
		}
		
		SinglyLinkedListNode curr=head3;
		
		while(head1!=null && head2!=null) {
			if(head1.data<head2.data) {
				curr.next=head1;
				head1=head1.next;
			}else {
				curr.next=head2;
				head2=head2.next;
			}
		}
		
		if(head1==null) {
			curr=head2;
		}
		else {
			curr=head1;
		}
		
		return head3;
		
	}
	
	static class SinglyLinkedListNode{
		int data;
		SinglyLinkedListNode next;
		
		public SinglyLinkedListNode(int data) {
			this.data=data;
		}
	}

}
