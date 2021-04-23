package problems;

public class Duplicates {

    public static void main(String[] args) {
        new Duplicates().duplicates();
    }

    void duplicates() {
        int[] array = new int[]{1, 8, 9, 5, 9, 6, 4, 7, 5}; // naturals numbers are > 0
        int size = array.length;

        for (int i = 1; i < size; i++) {
            int e = array[i];
            int absE = Math.abs(e) - 1;
            if (array[absE] >= 0) {
                array[absE] = -array[absE];
            } else {
                System.out.println(Math.abs(e));
            }
        }
    }
}
