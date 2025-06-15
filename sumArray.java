package Day2;

import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {

        // inputting the array from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF ARRAY :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("ENTER THE ELEMENTS OF ARRAY :    ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // calculating the sum of the array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("THE SUM OF THE ARRAY ELEMETS IS :" + sum);
    }
}
