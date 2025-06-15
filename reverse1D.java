package Day2;

import java.util.Arrays;//needed for Arrays.toString() method

public class reverse1D {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        // printing Original array
        System.out.print("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        // reversing the array

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));

        // Or //Reveresed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}
