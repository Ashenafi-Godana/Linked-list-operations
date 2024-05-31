public class Main {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList numbers = new LinkedList();

        // Inserting nodes at various positions
        // numbers.insertAt(10, 1);
        numbers.insertAt(10, 1);
        numbers.insertAt(20, 2);
        numbers.insertAt(30, 3);
        numbers.insertAt(40, 4);
        // // Displaying the LinkedList
        // System.out.println("LinkedList:");
        // numbers.display();

        // Deleting a node at a specific position
        // numbers.deleteFrom(3);

        // // Displaying the LinkedList after deletion
        // System.out.println("\nLinkedList after deleting node at position 3:");
        // linkedList.display();

        // Searching for a node with specific value
        int searchValue = 20;
        System.out.println("\nIs " + searchValue + " present in the LinkedList? " + numbers.searchNode(searchValue));

        // Creating a Stack
        // Stack stack = new Stack();

        // Pushing elements onto the stack
        // stack.push(50);
        // stack.push(60);
        // stack.push(70);

        // Displaying the Stack
        // System.out.println("\nStack:");
        // stack.display();

        // // Popping elements from the stack
        // System.out.println("\nPopped element: " + stack.pop());
        // System.out.println("Popped element: " + stack.pop());

        // Displaying the Stack after popping
        // System.out.println("\nStack after popping:");
        // stack.display();

        // // Peeking the top element of the stack
        // System.out.println("\nTop element of the stack: " + stack.peek());
    }
}
