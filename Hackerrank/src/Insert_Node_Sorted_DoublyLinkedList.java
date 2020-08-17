
public class Insert_Node_Sorted_DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
		DoublyLinkedListNode nodeToInsert = new DoublyLinkedListNode(data);
        if (head == null) return nodeToInsert;
        DoublyLinkedListNode current = head;
        while (current != null) {
            if (data < current.data && current.prev == null) {
                current.prev = nodeToInsert;
                nodeToInsert.next = current;
                return nodeToInsert;
            }
            if (data >= current.data && current.next == null) {
                current.next = nodeToInsert;
                nodeToInsert.prev = current;
                break;
            }
            if (data >= current.data && data <= current.next.data) {
                DoublyLinkedListNode temp = current.next;
                current.next = nodeToInsert;
                nodeToInsert.prev = current;
                temp.prev = nodeToInsert;
                nodeToInsert.next = temp;
                break;
            }
            current = current.next;
        }
        return head;
    }
	

	static class DoublyLinkedListNode {
	     int data;
	     DoublyLinkedListNode next;
	     DoublyLinkedListNode prev;
	     
	     public DoublyLinkedListNode(int data) {
	    	 this.data=data;
	     }
	}
}
