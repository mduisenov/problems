package hackerrank.data_structures;

public class LinkedList {

    private static final class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public boolean hasCycle() {
        if (head == null) return false;
        Node fast = head.next;
        Node slow = head;
        while (fast != null && fast.next != null && slow != null) {
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

    public void deleteWithValue(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if(current.next.data != data) {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }
}
