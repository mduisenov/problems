package stepic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class GreedyKnapsack {

    static class Item implements Comparable<Item> {
        int cost;
        int weight;

        Item(int cost, int weight) {
            this.cost = cost;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "cost=" + cost +
                    ", weight=" + weight +
                    '}';
        }

        @Override
        public int compareTo(Item o) {
            double r1 = (double) cost / weight;
            double r2 = (double) o.cost / o.weight;
            return Double.compare(r1, r2);
        }
    }

    private void run() throws FileNotFoundException {
        Scanner input = new Scanner(new File("knapsack_input.txt"));
        int n = input.nextInt();
        int w = input.nextInt();
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(input.nextInt(), input.nextInt());
        }
        Arrays.sort(items);
        double result = 0;
        for (Item item : items) {
            if (item.weight <= w) {
                result += item.cost;
                w -= item.weight;
            } else {
                result += (double) item.cost * w / item.weight;
                break;
            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        new GreedyKnapsack().run();
    }
}
