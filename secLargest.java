package Day2;

public class secLargest {
    public static void main(String[] args) {
        int arr[] = { 12, 3, 4, 5, 6, 7, 8, 9, 10 };

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

        }
        System.out.println("SECOND LARGEST ELEMENT IS :" + secondLargest);
    }

}
