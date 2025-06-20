package Day5;
//To add smthing in an existing element in an array without direct touching the element

import java.util.Arrays;

public class DifferenceArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        System.out.println("ORIGINAL ARRAY :" + Arrays.toString(arr));

        // diff array= chnage in each element of the array.
        int diff[] = new int[n + 1];// one xtra space to save frm erors.
        diff[0] = arr[0];
        for (int i = 1; i < n; i++) {
            diff[i] = arr[i] - arr[i - 1];// it will subtract each elemnet with the previous ele.
        }
        // adding 2 in each term from index 1 to 3
        int l = 1;
        int r = 3;
        int val = 2;

        diff[l] += 2;
        diff[r + 1] -= 2;// it stops adding at index 4..means adds till 3 only!

        // FINAL RESULT

        int result[] = new int[n + 1];
        result[0] = diff[0];
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + diff[i];
        }

        System.out.print("UPDATED ARRAY :" + Arrays.toString(result));

    }
}
