/**
 * A singly linked list implementation.
 */
public class LinkedList {
    /**
     * The head node of the linked list.
     */
    Node head;

    /**
     * Inserts a new node with the specified data at the given position in the
     * linked list.
     * 
     * @param data     The data to be stored in the new node.
     * @param position The position at which the new node should be inserted. The
     *                 position is 1-based.
     *                 If the position is invalid, the method prints "Invalid
     *                 position".
     */
    public void insertAt(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 1; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            } else {
                System.out.println("Invalid position");
            }
        }
    }

    /**
     * Deletes the node at the given position in the linked list.
     * 
     * @param position The position of the node to be deleted. The position is
     *                 1-based.
     *                 If the position is invalid, the method prints "Invalid
     *                 position".
     */
    public void deleteFrom(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            Node current = head;
            Node previous = null;
            for (int i = 1; i < position && current != null; i++) {
                previous = current;
                current = current.next;
            }
            if (current != null) {
                previous.next = current.next;
            } else {
                System.out.println("Invalid position");
            }
        }
    }

    /**
     * Searches for a node with the specified value in the linked list.
     * 
     * @param value The value to search for in the linked list.
     * @return {@code true} if a node with the specified value is found,
     *         {@code false} otherwise.
     */
    public boolean searchNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Displays the contents of the linked list.
     * Prints the data of each node in the linked list separated by spaces.
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
