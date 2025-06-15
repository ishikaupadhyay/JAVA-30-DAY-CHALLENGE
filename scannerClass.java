// Java program to demonstrate working of Scanner Class
import java.util.Scanner;

class scannerClass 
{
    public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        try (Scanner s = new Scanner(System.in)) {

            String s1 = s.nextLine();
            System.out.println("You entered string " + s1);

            int a = s.nextInt();
            System.out.println("You entered integer " + a);

            float b = s.nextFloat();
            System.out.println("You entered float " + b);
        }
    }
} 
    

