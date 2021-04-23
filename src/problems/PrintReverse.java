package problems;

import java.util.Scanner;



public class PrintReverse {

    public static void main(String[] args) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(1);
        SinglyLinkedListNode two = new SinglyLinkedListNode(2);
        SinglyLinkedListNode three = new SinglyLinkedListNode(3);
        SinglyLinkedListNode four = new SinglyLinkedListNode(4);
        SinglyLinkedListNode five = new SinglyLinkedListNode(5);

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        reversePrint(head);
    }

    private static void reversePrint(SinglyLinkedListNode head) {
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode curr = head;

        while (curr != null) {
            SinglyLinkedListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        while(prev != null) {
            System.out.println(prev.data);
            prev = prev.next;
        }
    }
}
