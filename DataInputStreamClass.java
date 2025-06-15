// Java program to read input using DataInputStream class
import java.io.*;

public class DataInputStreamClass {
  
    public static void main(String[] args)
        throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        // Reading integers
        System.out.print("Enter an integer: ");
        int i = Integer.parseInt(r.readLine());

        // Reading strings
        System.out.print("Enter a string: ");
        String s = r.readLine();
        System.out.println("You entered integer: " + i);
        System.out.println("You entered string: " + s);
    }
}