package hackerrank.data_structures.array;

public class HourglassSum {

    /*
       111 000 222 111 000 222
       111 000 222 111 000 222
       111 000 222 111 000 222
       111 000 222 111 000 222
       111 000 222 111 000 222
     */

    static int hourglassSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = {
                {'1','1','1','0','0','0'},
                {'1','0','1','1','1','0'},
                {'4','1','0','1','1','0'},
                {'4','1','0','1','1','0'},
                {'4','1','0','1','1','0'},
                {'4','1','0','1','1','0'}
        };
        System.out.println(hourglassSum(arr));
    }
}
