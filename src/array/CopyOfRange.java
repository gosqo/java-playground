package array;

import java.util.Arrays;

public class CopyOfRange {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = { 1, 2, 3, 4 ,5 ,6 };

        int[] arr2 = Arrays.copyOfRange(arr, 3, arr.length);
        System.out.println(Arrays.toString(arr2));

    }
}
