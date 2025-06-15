package Day2;

public class traversingArray {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] arr = {1, 2, 3, 4, 5};

             // Traverse the array using a for loop
        System.out.println("Traversing the array using a for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Traverse the array using an enhanced for loop
        System.out.println("Traversing the array using an enhanced for loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}