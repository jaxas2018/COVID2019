//https://www.geeksforgeeks.org/detect-loop-in-a-linked-list/

/*
 * 
Floyd’s Cycle-Finding Algorithm: This is the fastest method and has been described below:

Traverse linked list using two pointers. 
Move one pointer(slow_p) by one and another pointer(fast_p) by two. 
If these pointers meet at the same node then there is a loop. If pointers do not meet then linked list doesn’t have a loop

Time Complexity: O(n)
Auxiliary Space: O(1)
 * 
 * 
 */
public class Linked_List_Cycle_141M {
	  
	 
		static Node head; // head of list 

		/* Linked list Node*/
		class Node { 
			int data; 
			Node next; 
			Node(int d) 
			{ 
				data = d; 
				next = null; 
			} 
		} 

		/* Inserts a new Node at front of the list. */
		public void push(int new_data) 
		{ 
			/* 1 & 2: Allocate the Node & 
					Put in the data*/
			Node new_node = new Node(new_data); 

			/* 3. Make next of new Node as head */
			new_node.next = head; 

			/* 4. Move the head to point to new Node */
			head = new_node; 
		} 

		public boolean detectLoop(Node head) 
		{ 
			Node slow_p = head, fast_p = head; 
			while (slow_p != null && fast_p != null && fast_p.next != null) { 
				slow_p = slow_p.next; 
				fast_p = fast_p.next.next; 
				if (slow_p == fast_p) { 
					System.out.println("Found a loop"); 
					return true; 
				} 
			} 
			System.out.println("No loop was found!");
			return false; 
		} 

		/* Driver program to test above functions */
		public static void main(String args[]) 
		{ 
			Linked_List_Cycle_141M llist = new Linked_List_Cycle_141M(); 

			llist.push(20); 
			llist.push(4); 
			llist.push(15); 
			llist.push(10); 
			llist.push(30);
			llist.push(8);

			/*Create loop for testing */
			head.next.next.next =head.next; 

			llist.detectLoop(head); 
		} 
	} 
	 
