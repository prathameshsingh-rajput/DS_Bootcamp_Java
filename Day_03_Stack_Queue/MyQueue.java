import java.util.Scanner;

interface QueueI{
	boolean isEmpty();
	boolean isFull();
	void enqueue(int val);
	int dequeue();
	int peek();
	void display();
}

public class MyQueue implements QueueI{
	private int front;
	private int rear;
	private int size;
	private int[] queue;

	public MyQueue(int size){
		this.size = size;
		rear  = -1;
		front = -1;
		queue = new int[size];
	}

	public boolean isEmpty(){
		return (rear == -1 && front == -1);
	}

	public boolean isFull(){
		return (rear == size-1);
	}

	public void enqueue(int data){
		if(isFull()){
			System.out.println("Queue Overflow.");
			return;
		}

		if(isEmpty())	front++;

		queue[++rear] = data;
		return;
	}

	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue Underflow.");
			return -1;
		}

		int value = queue[front];

		if(front == rear){
			rear = -1;
			front = -1;
		}else{
			front++;
		}

		return val;
	}

	public int peek(){
		if(isEmpty()){
			System.out.println("Queue Underflow.");
			return -1;
		}

		return queue[front];
	}

	public void display(){
		if(isEmpty()){
			System.out.println("Queue Underflow.");
			return;
		}
		for(int i = front; i <= rear; ++i){
			System.out.print(queue[i]+" ");
		}
		return;
	}

	public static void main(String[]args){
		Scanner in = new Scanner(System.in);

		System.out.print("Enter size of queue: ");
		int size = in.nextInt();

		MyQueue q = new MyQueue(size);

		do{
			System.out.println("\n\n1. ENQUEUE");
			System.out.println("2. DEQUEUE");
			System.out.println("3. PEEK");
			System.out.println("4. DISPLAY");
			System.out.println("5. EXIT");

			System.out.print("Enter your choice: ");
			int choice = in.nextInt();

			switch(choice){
				case 1: System.out.print("Enter an element to ENQUEUE: ");
						q.enqueue(in.nextInt());
				break;
				case 2: System.out.print("Dequeued element: "+q.dequeue());
				break;
				case 3: System.out.print("Peeked element: "+q.peek());
				break;
				case 4: q.display();
				break;
				case 5: System.out.println("Program ended successfully.\n"); System.exit(0);
				break;
				default: System.out.println("Invalid Choice, Try Again!\n");
				break;
			}
		}while(true);


	}


}