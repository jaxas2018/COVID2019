package Java8;

import java.util.HashMap;
import java.util.Map;

public class Beginner1 {

	static Node head; 
	  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 
    
	public static void main(String[] args) {
		Beginner1 list = new Beginner1(); 
        list.head = new Node(85); 
        list.head.next = new Node(15); 
        list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(20); 
          
        System.out.println("Given Linked list"); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head);
        
		/*
		 * head = list.insertAtN(head,100,3); list.printList(head);
		 */
        
		
	}
	// prints content of double linked list 
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
    
    Node reverse(Node node) {
    	if(head == null) {
    		return head; 
    	}
    	
    	Node pointer = head; 
    	
    	while(node.next.next != null) {
    		pointer = pointer.next;
    		node = node.next.next;
    	}
    	
    	 head = node;
    	
    	 while(node != null) {
    		 node.next = pointer;
    		 node = node.next; 
    	 }
    	 
    	 node.next = null; 
    	
    	 
        return head; 
    }
    
    Node insertAtN(Node node,int data, int position) {
    	Node newNode = new Node(data);
    	if (position == 0) {
    		return newNode;
    	}
    	int counter = 1;
    	Node previous = head;
    	while (previous!=null && counter<position-1) {
    		previous = previous.next;	
    		counter++;
    	}
    	newNode.next=previous.next;
    	previous.next=newNode;
    	return head;
    	
    }
	
	
		 
}




