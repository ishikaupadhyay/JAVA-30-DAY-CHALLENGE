package Day2;

import java.util.Arrays;

//using sprting to find the second largest element in an array
public class secondLargest {
    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };

        Arrays.sort(arr); // Sort the array in ascending order
        int n = arr.length;
        int largest = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                System.out.println("SECOND LARGETS ELEMENT IS:" + arr[i]);
                return;
            }
        }
    }
}