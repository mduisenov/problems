package problems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {

//    public static void main(String[] args) {
//        List<List<Integer>> numbersList = new ArrayList<>();
//
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//
//        // input data
//        for (int i = 0; i < n; i++) {
//
//            int size = scan.nextInt();
//            List<Integer> numbers = new ArrayList<>();
//
//            for (int j = 0; j < size; j++) {
//                int number = scan.nextInt();
//                numbers.add(number);
//            }
//            numbersList.add(numbers);
//        }
//
//        // print data
//        int count = scan.nextInt();
//        for (int i = 0; i < count; i++) {
//            int a = scan.nextInt() - 1;
//            int b = scan.nextInt() - 1;
//
//            if (a < numbersList.size()) {
//                if (b < numbersList.get(a).size()) {
//                    int result = numbersList.get(a).get(b);
//                    System.out.println(result);
//                } else {
//                    System.out.println("ERROR!");
//                }
//            } else {
//                System.out.println("ERROR!");
//            }
//        }
//
//    }

    public static void main(String[] args) {

        SinglyLinkedListNode head = new SinglyLinkedListNode(141);
        SinglyLinkedListNode second = new SinglyLinkedListNode(302);
        SinglyLinkedListNode third = new SinglyLinkedListNode(164);
        SinglyLinkedListNode fourth = new SinglyLinkedListNode(530);
        SinglyLinkedListNode fifth = new SinglyLinkedListNode(474);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;


        SinglyLinkedListNode res =  insertNodeAtTail(head, 3);

        while (res != null) {
            System.out.println(res.data);
            res = res.next;
        }
    }
    private static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (head == null) {
            return newNode;
        }

        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
}



