 

public class Get_Node_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int getNode(SinglyLinkedListNode head,int positionFromTail) {
		
		 
		SinglyLinkedListNode pointer=head;
		
		int count=0;
		
		while(head!=null) {
			head=head.next;
			
			if(count<positionFromTail) {
				count++;
			}else {
				pointer=pointer.next;
			}
		}
		 
		return pointer.data;
		
	}
	
	static class SinglyLinkedListNode{
		int data;
		SinglyLinkedListNode next;
		
		public SinglyLinkedListNode(int data) {
			this.data=data;
		}
	}

}