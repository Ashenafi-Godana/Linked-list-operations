/**
 * Class representing a stack using a linked list.
 */
public class Stack {
    private Node head;

    /**
     * Constructor to initialize the stack.
     * The stack is initially empty.
     */
    public Stack() {
        this.head = null;
    }

    /**
     * Check if the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Push a new element onto the stack.
     * 
     * @param data The data to be pushed onto the stack.
     */
    public void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = null;
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }   
        current.next = newNode;

        System.out.println("Pushed " + data + " onto the stack.");
    }

    /**
     * Pop the top element from the stack.
     * 
     * @return The data of the popped element. Returns -1 if the stack is empty.
     */
    public int pop() {

        // check if the list is empty
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        // if there is only one node in the list
        if (head.next == null) {
            head = null;
        }
        else 
        {
            Node current = head;
            // traverse the list to find the second-to-last node
            while (current.next.next != null) {
                current = current.next;
            }
            // set the next of the second-to-last node to null
            int result = current.next.data;
            current.next = null;
            return result;
        }
        return -1;

    }

    /**
     * Peek at the top element of the stack without removing it.
     * 
     * @return The data of the top element. Returns -1 if the stack is empty.
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        // if there is only one node in the list
        if (head.next == null) {
            return head.data;
        }
        else 
        {
            Node current = head;
            // traverse the list to find the last node
            while (current.next != null) {
                current = current.next;
            }
            return current.data;
        }
    }

    /**
     * Display all elements in the stack from top to bottom.
     */
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}