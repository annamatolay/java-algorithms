package data_structure;

import common.Node;

/**
 * Linear data structure.
 * LIFO: Last in, first out
 */
public class Stack {
    private Node top;

    private boolean isEmpty() {
        return top == null;
    }

    private int peek() {
        return top.getData();
    }

    private void push(int data) {
        Node node = new Node(data);
        node.setNext(top);
        top = node;
    }

    private int pop() {
        int data = top.getData();
        top = top.getNext();
        return data;
    }
}
