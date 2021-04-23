package stepic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinarySearch {

    private int binarySearch(int[] a, int x) {
        int l = 0;
        int r = a.length - 1;
        while (r >= l) {
            int m = (l + r) / 2;
            if (a[m] == x) {
                return m;
            } else if (a[m] > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        new BinarySearch().run();
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }

    private void run() throws FileNotFoundException {
        Scanner in = new Scanner(new File("binary_search_input.txt"));
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int k = in.nextInt();
        int[] b = new int[k];
        for (int i = 0; i < k; i++) {
            b[i] = in.nextInt();
        }

        for (int i = 0; i < k; i++) {
            int pos = binarySearch(a, b[i]);
            System.out.println(pos);
        }
    }
}
