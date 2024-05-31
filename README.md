# LinkedList and Stack Implementation

This project demonstrates the implementation of a LinkedList and a Stack  data structure using LinkedList in Java.

## Files

- `Node.java`: Defines the Node class representing individual elements in the LinkedList.
- `LinkedList.java`: Implements the LinkedList data structure with methods for insertion, deletion, and searching.
- `Stack.java`: Implements a Stack data structure using LinkedList. It provides methods for push, pop, and peek operations.
- `Main.java`: Contains a sample program demonstrating the usage of LinkedList and Stack.

## Usage

To use the LinkedList and Stack classes in your project:

1. Import the required classes into your project.
2. Create LinkedList and Stack objects.
3. Use the provided methods to perform operations on the data structures.

Example usage:

```java
// Creating a LinkedList
LinkedList linkedList = new LinkedList();

// Inserting nodes at various positions
linkedList.insertAt(10, 1);
linkedList.insertAt(20, 2);
linkedList.insertAt(30, 3);

// Displaying the LinkedList
linkedList.display();

// Creating a Stack
Stack stack = new Stack();

// Pushing elements onto the stack
stack.push(50);
stack.push(60);

// Popping elements from the stack
int poppedElement = stack.pop();
# Linked-list-operations
