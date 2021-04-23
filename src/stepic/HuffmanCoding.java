package stepic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanCoding {

    static class Node implements Comparable<Node> {
        final int sum;
        String code;

        public Node(int sum) {
            this.sum = sum;
        }

        void buildCode(String code) {
            this.code = code;
        }
        @Override
        public int compareTo(Node node) {
            return Integer.compare(sum, node.sum);
        }
    }

    static class InternalNode extends Node {
        Node left;
        Node right;

        @Override
        void buildCode(String code) {
            super.buildCode(code);
            left.buildCode(code + "0");
            right.buildCode(code + "1");
        }

        public InternalNode(Node left, Node right) {
            super(left.sum + right.sum);
            this.left = left;
            this.right = right;
        }
    }

    static class LeafNode extends Node {
        char symbol;

        @Override
        void buildCode(String code) {
            super.buildCode(code);
            System.out.println(symbol + ": " + code);
        }

        public LeafNode(char symbol, int count) {
            super(count);
            this.symbol = symbol;
        }
    }

    private void run() throws FileNotFoundException {
        Scanner input = new Scanner(new File("huffman_coding_input.txt"));
        String s = input.next();
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }

        Map<Character, Node> charNodes = new HashMap<>();
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            LeafNode leafNode = new LeafNode(entry.getKey(), entry.getValue());
            charNodes.put(entry.getKey(), leafNode);
            priorityQueue.add(leafNode);
        }
        int sum = 0;
        while (priorityQueue.size() > 1) {
            Node first = priorityQueue.poll();
            Node second = priorityQueue.poll();
            InternalNode node = new InternalNode(first, second);
            sum += node.sum;
            priorityQueue.add(node);
        }
        if (count.size() == 1) {
            sum = s.length();
        }

        System.out.println(count.size() + " " + sum);
        Node root = priorityQueue.poll();
        if (count.size() == 1) {
            root.buildCode("0");
        } else {
            root.buildCode("");
        }

        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            encoded.append(charNodes.get(c).code);
        }
        System.out.println(encoded);
    }

    public static void main(String[] args) throws FileNotFoundException {
        new HuffmanCoding().run();
    }
}
