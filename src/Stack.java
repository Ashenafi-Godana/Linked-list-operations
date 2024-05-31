public class Stack {
    private LinkedList list;

    public Stack() {
        list = new LinkedList();
    }

    // Method to push an element onto the stack
    public void push(int data) {
        list.insertAt(data, 1); // Insert at the beginning of the list (top of the stack)
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1; // or throw an exception
        }
        int data = list.head.data; // Store the data at the top of the stack
        list.deleteFrom(1); // Delete the top node
        return data;
    }

    // Method to peek the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        }
        return list.head.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return list.head == null;
    }

    // Method to display the elements of the stack
    public void display() {
        list.display(); // Display the contents of the linked list
    }
}
