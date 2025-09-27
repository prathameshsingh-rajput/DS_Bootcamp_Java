class MyStack {
    private static final int DEFAULT_SIZE = 10;
    private Object[] stack;
    private int top;

    public MyStack() {
        stack = new Object[DEFAULT_SIZE];
        top = -1; 
    }

    public void push(Object item) {
        if (top == DEFAULT_SIZE - 1) {
            System.out.println("Stack Overflow! Cannot push " + item);
            return;
        }
        stack[++top] = item;
        System.out.println(item + " pushed to stack");
    }

    public Object pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
            return null;
        }
        return stack[top--];
    }

    public Object peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stack[top];
    }

    public int search(Object item){
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
    
        for (int i = top; i >= 0; --i) {
            if (stack[i].equals(item)) {
                return top - i;
            }
        }
        return -1;
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        stack.display();

        System.out.println("Element 10 at index:  "+stack.search(10));
        System.out.println("Element 20 at index:  "+stack.search(20));
        System.out.println("Element 30 at index:  "+stack.search(30));
    }
}
