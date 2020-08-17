 
public class Find_MergePoint_Two_Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2){
		SinglyLinkedListNode head1_curr=head1;
		SinglyLinkedListNode head2_curr=head2;
		
		while(head1_curr!=head2_curr) {
			if(head1_curr==null) {
				head1_curr=head2;
			}else {
				head1_curr=head1_curr.next;
			}
			
			if(head2_curr==null) {
				head2_curr=head1;
			}else {
				head2_curr=head2_curr.next;
			}
		}
		
		
        return head1_curr.data;
	}
	
	static class SinglyLinkedListNode{
		int data;
		SinglyLinkedListNode next;
		
		public SinglyLinkedListNode(int data) {
			this.data=data;
		}
	}

}
