package hackerrank.algorithms;

import java.util.Arrays;

public class IceCreamParlor {

    public static int[] findChoices(int[] menu, int money) {
        int[] sortedMenu = menu.clone();
        Arrays.sort(sortedMenu);

        for (int value : sortedMenu) {
            int complement = money - value;
            int location = Arrays.binarySearch(sortedMenu, complement);
            if (
                    location >= 0 &&
                    location < sortedMenu.length &&
                    sortedMenu[location] == complement
            ) {
                return getIndicesFromValues(menu, value, complement);
            }
        }

        return null;
    }

    private static int[] getIndicesFromValues(int[] menu, int value1, int value2) {
        int index1 = indexOf(menu, value1, -1);
        int index2 = indexOf(menu, value2, index1);
        return new int[]{
                Math.min(index1, index2),
                Math.max(index1, index2)
        };
    }

    private static int indexOf(int[] menu, int value, int excludeThis) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == value && i != excludeThis) {
                return i;
            }
        }
        return -1;
    }
}
