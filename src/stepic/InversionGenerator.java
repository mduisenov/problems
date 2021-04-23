package stepic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class InversionGenerator {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter =  new PrintWriter("inversions_input.txt");
        int n = 1000000;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            printWriter.print(random.nextInt() + " ");
        }
        printWriter.close();
    }
}
