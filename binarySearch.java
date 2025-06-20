package Day7;

import java.util.Arrays;
import java.util.Scanner;
//same task as of linear
//for sorted arrays and big ones

public class binarySearch {

    public static int BinarySearching(int arr[], int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY :");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("ENTER " + n + "ELEMENTS FOR THE ARRAY :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("SORTED ARRAY :" + Arrays.toString(arr));

        System.out.println("ENTER THE ELEMENT YOU WANNA FIND IN THE ARRAY :");
        int target = sc.nextInt();

        int index = BinarySearching(arr, target);

        if (index == -1) {
            System.out.println("NO ELEMENT FOUND!");
        } else {
            System.out.println("ELEMENT FOUND AT INDEX : " + index);
        }
    }

}