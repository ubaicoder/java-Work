import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type a number:");
        
        // Check if input is available
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("You typed: " + number);
        } else {
            System.out.println("No input provided. Exiting...");
        }

        scanner.close();
    }
}
