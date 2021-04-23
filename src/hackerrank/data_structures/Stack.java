package hackerrank.data_structures;

public class Stack {

    private static final class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.data;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }
}
