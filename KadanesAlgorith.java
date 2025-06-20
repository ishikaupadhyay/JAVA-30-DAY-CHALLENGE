package Day6;

import java.util.Arrays;

//algo to find out the maximum subaaray from a given array!
public class KadanesAlgorith {
    public static void main(String[] args) {
        int arr[] = { 1, 2, -4, 5, 8, 0, -1, 8, 9 };

        int currentSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
        }
        if (currentSum > maxSum) {
            maxSum = currentSum;
        } else if (currentSum < 0) {
            currentSum = 0;
        }
        System.out.println(maxSum);
    }

}
