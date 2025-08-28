import java.util.Scanner;

interface StackI{
	public void push(int a);
	public int pop();
	public int peek();
	public boolean isEmpty();
	public boolean isFull();
	public void display();
	public boolean contains(int key);
}
public class MyStack implements StackI{
	private int size;
	private int top;
	private int []stack;

	public MyStack(int size){
		this.size = size;
		this.top = -1;
		stack = new int[size];
	}

	public boolean isEmpty(){
		return top == -1;
	}

	public boolean isFull(){
		return top == size-1;
	}

	public void push(int data){
		if(isFull()){
			System.out.println("Stack Overflow.");
 			return;
		}

		stack[++top] = data;
		System.out.println(data+" pushed at index "+top+".");
		return;
	}

	public int pop(){
		if(isEmpty()){
			System.out.println("Stack Underflow.");
			return -1;
		}

		return top--;
	}

	public int peek(){
		if(isEmpty()){
			System.out.println("Stack Underflow.");
			return -1;
		}
		return top;
	}

	public void display(){
		if(isEmpty()){
			System.out.println("Stack Underflow.");
			return;
		}

		for(int i = top; i >= 0; --i){
			System.out.print(stack[i]+" ");
		}
		return;
	}

	public boolean contains(int key){
		if(isEmpty()){
			System.out.println("Stack Underflow.");
			return false;
		}

		for(int i = top; i >= 0; --i){
			if(stack[top] == key)
				return true;
		}

		return false;
	}

	public static void main(String[]args){
		Scanner in = new Scanner(System.in);

		System.out.print("Enter size of stack: ");
		int size = in.nextInt();

		MyStack s = new MyStack(size);

		do{
			System.out.println("\n\n1. PUSH");
			System.out.println("2. POP");
			System.out.println("3. PEEK");
			System.out.println("4. SEARCH");
			System.out.println("5. DISPLAY");
			System.out.println("6. EXIT");

			System.out.print("Enter your choice: ");
			int choice = in.nextInt();

			switch(choice){
				case 1: System.out.print("Enter an element to PUSH: ");
						s.push(in.nextInt());
				break;
				case 2: int popIdx = s.pop();
						if(popIdx != -1 ) System.out.print("Poped element: "+s.stack[popIdx]);
				break;
				case 3: int peekIdx = s.peek();
						if(peekIdx != -1 ) System.out.print("Peeked element: "+s.stack[peekIdx]);
				break;
				case 4: System.out.print("Enter an element to search: "); if(s.contains(in.nextInt())) System.out.println("Element present in stack."); else System.out.println("Element not present in stack.");
				break;
				case 5: s.display();
				break;
				case 6: System.out.println("Program ended successfully.\n"); System.exit(0);
				break;
				default: System.out.println("Invalid Choice, Try Again!\n");
				break;
			}
		}while(true);


	}


}