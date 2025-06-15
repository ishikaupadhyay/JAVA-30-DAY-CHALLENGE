package Day2;

public class EvenOdd {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };

        int EvenCount = 0;
        int OddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {

                //System.out.println(arr[num] + " is even");
                EvenCount++;
            } else {
                //System.out.println(arr[num] + " is odd");
                OddCount++;
            }
        }
        System.out.println("TOTAL EVEN NUMBERS IN THE ARRAY :" + EvenCount);
        System.out.println("TOTAL EVEN NUMBERS IN THE ARRAY :" + OddCount);
    }

}
