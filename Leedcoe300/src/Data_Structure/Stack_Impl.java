package Data_Structure;

import java.util.EmptyStackException;

//Java Code for Linked List Implementation 
public class Stack_Impl {
 
	StackNode top; 
	int size=0;

	static class StackNode { 
		int data; 
		StackNode next; 

		StackNode(int data) 
		{ 
			this.data = data; 
		} 
	} 

	public boolean isEmpty() 
	{ 
		if (top == null) { 
			return true; 
		} 
		 
		return false; 
	} 

	public void push(int data) 
	{ 
		StackNode newNode = new StackNode(data); 

		if (top == null) { 
			top = newNode; 
			size++;
		} 
		else { 
			StackNode temp = top; 
			top = newNode; 
			newNode.next = temp; 
			size++;
		} 
		System.out.println(data + " pushed to stack"); 
	} 

	public int pop() 
	{ 
		int popped; 
		if (top == null) { 
			System.out.println("Stack is Empty"); 
			throw new EmptyStackException();
		} 
		else { 
			popped = top.data; 
			top = top.next;
			size--;
		} 
		return popped; 
	} 
	
	public int size(StackNode top) {
		return size;
	}

	public int peek() 
	{ 
		if (top == null) { 
			System.out.println("Stack is empty"); 
			throw new EmptyStackException(); 
		} 
		else { 
			return top.data; 
		} 
	} 

	public static void main(String[] args) 
	{ 

		Stack_Impl stack = new Stack_Impl(); 

		System.out.println("Before Pushing...");
		System.out.println(stack.isEmpty());
		stack.push(10); 
		stack.push(20);

		System.out.println("Stack size is "+stack.size);
		
		stack.push(30); 
		
		System.out.println("Stack size is "+stack.size);
		
		System.out.println("After pushing...");
		System.out.println(stack.isEmpty());

		System.out.println(stack.pop() + " popped from stack"); 
		
		System.out.println("Stack size is "+stack.size);
		
		System.out.println(stack.pop() + " popped from stack"); 
		
		System.out.println("Stack size is "+stack.size);

		System.out.println("Top element is " + stack.peek()); 
		
		System.out.println(stack.pop() + " popped from stack"); 
		
		System.out.println("Stack size is "+stack.size);
		
		//System.out.println(stack.pop() + " popped from stack");
	} 
} 
