package stepic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EditingDistance {

    private String first;
    private String second;

    int[][] d;
    boolean[][] calculated;

    private int editingDistance(int n, int m) {
        if (n == 0) return m;
        if (m == 0) return n;
        if (calculated[n][m]) {
            return d[n][m];
        }
        int res1 = editingDistance(n, m - 1) + 1;
        int res2 = editingDistance(n - 1, m) + 1;
        int res3 = editingDistance(n - 1, m - 1) + (first.charAt(n - 1) == second.charAt(m - 1) ? 0 : 1);
        calculated[n][m] = true;
        int result = Math.min(Math.min(res1, res2), res3);
        d[n][m] = result;
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        new EditingDistance().run();
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }

    private void run() throws FileNotFoundException {
        Scanner in = new Scanner(new File("editing_distance_input.txt"));
        first = in.next();
        second = in.next();
        d = new int[first.length() + 1][second.length() + 1];
//        calculated = new boolean[first.length() + 1][second.length() + 1];
//        System.out.println(editingDistance(first.length(), second.length()));

        // iterative way
        for (int n = 0; n < first.length(); n++) {
            for (int m = 0; m < second.length(); m++) {
                if (n == 0 && m == 0) d[n][m] = 0;
                else if (n == 0) d[n][m] = m;
                else if (m == 0) d[n][m] = n;
                else {
                    int res1 = d[n][m - 1] + 1;
                    int res2 = d[n - 1][m] + 1;
                    int res3 = d[n - 1][m - 1] + (first.charAt(n - 1) == second.charAt(m - 1) ? 0 : 1);
                    int result = Math.min(Math.min(res1, res2), res3);
                    d[n][m] = result;
                }
            }
        }

        int n = first.length();
        int m = second.length();

        StringBuilder firstLine = new StringBuilder();
        StringBuilder secondLine = new StringBuilder();

        while (n > 0 || m > 0) {
            if (n == 0) {
                firstLine.append("-")
                        .append(firstLine);
                secondLine.append(second.charAt(m - 1))
                        .append(secondLine);
                m--;
            } else if (m == 0) {
                firstLine.append(first.charAt(n - 1)).append(firstLine);
                secondLine.append("-").append(secondLine);
                n--;
            } else {
                int res1 = d[n][m - 1] + 1;
                int res2 = d[n - 1][m] + 1;
                int res3 = d[n - 1][m - 1] + (first.charAt(n - 1) == second.charAt(m - 1) ? 0 : 1);
                int result = Math.min(Math.min(res1, res2), res3);
                d[n][m] = result;
            }
        }

        System.out.println(d[first.length()][second.length()]);
    }
}
