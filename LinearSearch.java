package Day7;

import java.util.*;
import java.util.Arrays;

public class LinearSearch {

    public static int LinearSearching(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static void CountOccurence(int arr[],int target) {
        int currentCount=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==target)
            currentCount++;
        }
        System.out.println("Target element   occurs " + currentCount + "times");
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
        System.out.println("ENTER THE ELEMENT YOU WANNA FIND IN THE ARRAY :");
        int target = sc.nextInt();

        int index = LinearSearching(arr, target);

        if (index == -1) {
            System.out.println("ELEMENT NOT FOUND !");
        } else {
            System.out.println("ELEMENT FOUND AT INDEX :" + index);

        }
        CountOccurence(arr, target);

    }
}
