package chapter3.item14;

import java.util.Arrays;

/**
 * 아이템14. Comparable을 구현할지 고려해라
 */
public class Item14Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5, 1, 2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
