package Day2;

public class MinMax {
    public static void main(String[]args){
        int arr[]={3,2,1,0,6,5,4};

        int max=arr[0];
        int min=arr[0];


        for(int i=0;i<arr.length;i++){
            if (arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
System.out.println("Maximum value in the array is: " + max);
System.out.println("Minimum value in the array is: " + min);
    }
}
