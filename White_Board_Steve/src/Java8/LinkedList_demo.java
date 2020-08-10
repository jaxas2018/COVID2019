package Java8;

public class LinkedList_demo {
	
	private static class LinkedNode{
		private int data;
		private LinkedNode next; 
		
		public LinkedNode(int data) {
			this.data = data; 
		}
	}
	
	
	public static void main(String[] args) {
		//create a linked list
		//10 --> 8 --> 1 --> 11 --> null
		
		LinkedNode head = new LinkedNode(10);
		LinkedNode second = new LinkedNode(8);
		LinkedNode third = new LinkedNode(1);
		LinkedNode fourth = new LinkedNode(11);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		
		/*
		 * printAll(head); LinkedLength(head); LinkedNode newHead =
		 * insertBeginning(head, 15); printAll(newHead);
		 * 
		 * System.out.println();
		 * 
		 * LinkedNode newHead2 = insertEnd(head, 18);
		 * 
		 * printAll(newHead2);
		 */
		/*
		 * LinkedNode newHead2 = insertPosition(head, 3, 20);
		 * 
		 * printAll(newHead2);
		 */
		
		LinkedNode newHead3 = reverse(head);
		printAll(newHead3);
		
		
		
	}

	private static LinkedNode reverse(LinkedNode head) {
		// TODO Auto-generated method stub
		LinkedNode prev = null;
		LinkedNode next = null;
		LinkedNode current = head;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev; 
	}


	private static LinkedNode insertPosition(LinkedNode head, int position, int data) {
		// TODO Auto-generated method stub
		LinkedNode current = head; 
		LinkedNode newNode = new LinkedNode(data);
		
		int count = 0;
		
		while(count<position-2) {
			current = current.next;
			count++;
		}
		
		LinkedNode temp = current.next;
		newNode.next = temp;
		current.next = newNode; 
		
		return head; 
		
	}


	private static LinkedNode insertEnd(LinkedNode head, int data) {
		// TODO Auto-generated method stub
		
		LinkedNode current = head;
		
		LinkedNode newEnd = new LinkedNode(data); 
		
		while(current.next != null) {
			current = current.next; 
		}
		
		current.next = newEnd; 
		newEnd.next = null; 
		
		return head;
	}



	private static LinkedNode insertBeginning(LinkedNode head, int data) {
		// TODO Auto-generated method stub
		LinkedNode newNode = new LinkedNode(data);
		
		newNode.next = head;
		head = newNode; 
		
		return head; 
		
	}


	private static void LinkedLength(LinkedNode head) {
		// TODO Auto-generated method stub
		LinkedNode current = head; 
		
		int count = 0;
		
		while(current != null) {
			count++;
			current = current.next;
		}
		System.out.println("\nLinkedNode length is " + count);
		
	}


	private static void printAll(LinkedNode head) {
		// TODO Auto-generated method stub
		if(head == null) {
			return; 
		}
		
		LinkedNode current = head;
		
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print(current);
	}

}


