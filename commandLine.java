public class commandLine {
    public static void main(String[] args) {
        // Check if any command line arguments are provided
        if (args.length == 0) {
            System.out.println("No command line arguments provided.");
        } else {
            System.out.println("Command line arguments:");
            // Iterate through the command line arguments and print them
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
