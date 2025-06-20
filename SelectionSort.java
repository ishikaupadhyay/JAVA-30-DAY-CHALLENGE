package Day8;

import java.util.Arrays;

public class SelectionSort {

    public static void SelectionSortProcess(int arr[]) {

        for (int i = 0; i < arr.length-1; i++) {
            int min_index = i;
 
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // arranging in ascending Order :
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 23, 0, 9, 34, 56, 67 };

        System.out.print("ORIGINAL ARRAY :" + Arrays.toString(arr) + " ");

        System.out.println();
        SelectionSortProcess(arr);
       
            System.out.print("SORTED ARRAY :" + Arrays.toString(arr) + " ");

        

    }
}