package Day8;

import java.util.Arrays;

public class BubbleSort {
    public static void BubbleSorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {// SWAAPPING ELEMENTS
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 5, 7, 9, 4, 20, 12 };

        System.out.println("ORIGINAL ARRAY :" + Arrays.toString(arr));

        BubbleSorting(arr);

        System.out.println("SORTED ARRAY :" + Arrays.toString(arr));

    }
}
