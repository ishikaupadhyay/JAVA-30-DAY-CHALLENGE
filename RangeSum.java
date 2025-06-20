package Day6;

//program to find the sum of elements from certain range to a certain range!
public class RangeSum {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int n = arr.length;

        // USING PREFIX SUM METHOD - which calculates the sum of all elements frm index
        // 0 to i!

        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Conditions given:
        int l = 1, r = 3;// means -find the SUM from index 1 to 3;
        int range = prefix[r] - (l > 0 ? prefix[l - 1] : 0);
        System.out.println("THE SUM OF ARRAY from index 1 to 3 is :" + range);
    }

}
