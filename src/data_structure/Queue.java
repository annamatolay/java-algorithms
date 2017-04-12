package data_structure;

import common.Node;

/**
 * Linear data structure.
 * FIFO: First in, first out
 */
public class Queue {
    // add things here
    private Node tail;
    // remove from the head
    private Node head;

    private boolean isEmpty() {
        return head == null;
    }

    private int peek() {
        return head.getData();
    }

    public void add(int data) {
        Node node = new Node(data);
        if (tail != null) {
            tail.setNext(node);
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }

    public int remove() {
        int data = head.getData();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public static void main(String[] args) {

    }
}
