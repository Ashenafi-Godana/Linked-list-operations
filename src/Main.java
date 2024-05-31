public class Main {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList linkedList = new LinkedList();

        // Inserting nodes at various positions
        linkedList.insertAt(10, 1);
        linkedList.insertAt(20, 2);
        linkedList.insertAt(30, 3);
        linkedList.insertAt(40, 2);

        // Displaying the LinkedList
        System.out.println("LinkedList:");
        linkedList.display();

        // // Deleting a node at a specific position
        // linkedList.deleteFrom(3);

        // // Displaying the LinkedList after deletion
        // System.out.println("\nLinkedList after deleting node at position 3:");
        // linkedList.display();

        // // Searching for a node with specific value
        // int searchValue = 20;
        // System.out.println("\nIs " + searchValue + " present in the LinkedList? " + linkedList.searchNode(searchValue));

        // // Creating a Stack
        // Stack stack = new Stack();

        // // Pushing elements onto the stack
        // stack.push(50);
        // stack.push(60);
        // stack.push(70);

        // // Displaying the Stack
        // System.out.println("\nStack:");
        // stack.display();

        // // Popping elements from the stack
        // System.out.println("\nPopped element: " + stack.pop());
        // System.out.println("Popped element: " + stack.pop());

        // // Displaying the Stack after popping
        // System.out.println("\nStack after popping:");
        // stack.display();

        // // Peeking the top element of the stack
        // System.out.println("\nTop element of the stack: " + stack.peek());
    }
}
