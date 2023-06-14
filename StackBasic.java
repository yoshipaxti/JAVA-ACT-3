public class StackBasic {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public StackBasic(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // initially stack is empty
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }

        stackArray[++top] = value;
        System.out.println("Pushed element: " + value);
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return;
        }

        int poppedElement = stackArray[top--];
        System.out.println("Popped element: " + poppedElement);
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot peek element.");
            return -1;
        }

        return stackArray[top];
    }

    public static void main(String args[]) {
        StackBasic stack = new StackBasic(3);
        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element: " + stack.peek());
    }
}
