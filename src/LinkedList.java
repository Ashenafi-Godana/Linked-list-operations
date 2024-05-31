public class LinkedList {
    Node head;

    // Method for inserting a node at any given position
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

    // Method for deleting a node at any given position
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

    // Method for searching a node with specific value
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

    // Method to display the LinkedList
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
