// Java program to demonstrate BufferedReader
import java.io.BufferedReader;//it reads the code efficiently
import java.io.IOException;//handling inout/output exceptions
import java.io.InputStreamReader;//converts byte to character stream

public class Buffer_Reader {
  
    public static void main(String[] args)
        throws IOException
    {
        // Enter data using BufferReader
        BufferedReader r = new BufferedReader(
            new InputStreamReader(System.in));

        // Reading data using readLine
        System.out.println("Enter a line of text:");
        String s = r.readLine();

        // Printing the read line
        System.out.println(s);
    }
}