package stepic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class EditDistanceGenerator {
    public static void main(String[] args) throws FileNotFoundException {
        new EditDistanceGenerator().run();
    }

    private void run() throws FileNotFoundException {
        PrintWriter printWriter =  new PrintWriter("editing_distance_input.txt");
        int n = 10000;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            printWriter.print((char)('a' + random.nextInt(26)));
        }
        printWriter.println();
        for (int i = 0; i < n; i++) {
            printWriter.print((char)('a' + random.nextInt(26)));
        }
        printWriter.close();
    }
}
