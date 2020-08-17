 

public class Delete_Duplicate_Node {

	public static void main(String[] args) {
		

	}
	
	static SinglyLinkedListNode deleteDupNode(SinglyLinkedListNode head) {
		if(head==null) return head;
        SinglyLinkedListNode curr=head;
        SinglyLinkedListNode nextNode;

        while(curr.next!=null){
            if(curr.data==curr.next.data){
                nextNode=curr.next.next;
                if(nextNode==null) {
                	curr.next=null;
                	break;
                }
                curr.next=nextNode;
            }
            if(curr.data!=curr.next.data) {
            	curr=curr.next;
            }
        }

        return head;
	}
	
	static class SinglyLinkedListNode{
		int data;
		SinglyLinkedListNode next;
		
		public SinglyLinkedListNode(int data) {
			this.data=data;
		}
	}

}
