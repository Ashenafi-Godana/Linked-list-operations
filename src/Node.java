/**
 * A node in a singly linked list.
 */
public class Node {
    /**
     * The data stored in this node.
     */
    int data;

    /**
     * The reference to the next node in the linked list.
     */
    Node next;

    /**
     * Constructs a new node with the specified data.
     * 
     * @param data The data to be stored in the new node.
     */
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
