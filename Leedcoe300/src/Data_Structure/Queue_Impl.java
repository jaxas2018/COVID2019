package Data_Structure;
//Java program for linked-list implementation of queue 

//A linked list (LL) node to store a queue entry 

public class Queue_Impl { 
	QNode front, rear; 

	public Queue_Impl() 
	{ 
		this.front = this.rear = null; 
	} 
	
	static class QNode { 
		int key; 
		QNode next; 

	// constructor to create a new linked list node 
		public QNode(int key) { 
		this.key = key; 
		this.next = null; 
		} 
	} 

	// Method to add an key to the queue. 
	void enqueue(int key) 
	{ 

		// Create a new LL node 
		QNode temp = new QNode(key); 

		// If queue is empty, then new node is front and rear both 
		if (rear == null) { 
			front = rear = temp; 
			System.out.println("First enqueued: "+temp.key);
			return; 
		} 

		// Add the new node at the end of queue and change rear 
		rear.next = temp; 
		rear = temp; 
		System.out.println("Element enqueued: "+temp.key);
	} 

	// Method to remove an key from queue. 
	void dequeue() 
	{ 
		// If queue is empty, return NULL. 
		if (front == null) 
			return; 

		// Store previous front and move front one node ahead 
		QNode temp = front; 
		front = front.next; 
		System.out.println("The element dequeued: "+temp.key);

		// If front becomes NULL, then change rear also as NULL 
		if (front == null) 
			rear = null; 
	} 


 
	public static void main(String[] args) { 
		Queue_Impl q = new Queue_Impl(); 
		q.enqueue(10); 
		q.enqueue(20); 
		q.dequeue(); 
		q.dequeue(); 
		q.enqueue(30); 
		q.enqueue(40); 
		q.enqueue(50); 
		q.dequeue(); 
		System.out.println("Queue Front : " + q.front.key); 
		System.out.println("Queue Rear : " + q.rear.key); 
	} 
} 
 

