package stepic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Inversions {

    private long count = 0;

    private int[] merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int[] res = new int[a.length + b.length];
        for (int k = 0; k < res.length; k++) {
            if (j == b.length || (i < a.length && a[i] <= b[j])) {
                res[k] = a[i];
                i++;
            } else {
                // a[i] > b[j]
                count += a.length - i;
                res[k] = b[j];
                j++;
            }
        }
        return res;
    }

    private int[] mergeSort(int[] a) {
        if (a.length == 1) return a;
        int n = a.length;
        int m = n / 2;
        int[] left = new int[m];
        int[] right = new int[n - m];
        System.arraycopy(a, 0, left, 0, m);
        System.arraycopy(a, m, right, 0, n - m);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    private void run() throws FileNotFoundException {
        Scanner input = new Scanner(new File("inversions_input.txt"));
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        new Inversions().run();
    }
}
