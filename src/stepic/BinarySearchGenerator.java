package stepic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class BinarySearchGenerator {
    public static void main(String[] args) throws FileNotFoundException {
        new BinarySearchGenerator().run();
    }

    private void run() throws FileNotFoundException {
        PrintWriter printWriter =  new PrintWriter("binary_search_input.txt");
        int n = 100000;
        int k = 100000;
        Random random = new Random();
        int[] a = new int[n];
        int[] b = new int[k];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(1000000000);
        }
        Arrays.sort(a);
        for (int i = 0; i < k; i++) {
            b[i] = a[random.nextInt(n)];
        }
        printWriter.print(n);
        for (int i = 0; i <n; i++) {
            printWriter.print(" " + a[i]);
        }
        printWriter.println();
        printWriter.print(k);
        for (int i = 0; i < k; i++) {
            printWriter.print(" " + b[i]);
        }
        printWriter.println();
        printWriter.close();
    }
}
