import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first string (or type 'exit' to quit): ");
            String name = obj1.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break; // Exit the loop
            }

            System.out.println("Enter Second string: ");
            String str = obj1.nextLine();

            if (name.equalsIgnoreCase(str)) {
                System.out.println("Strings are Equal.");
            } else {
                System.out.println("Strings are not equal.");
            }
        }
        obj1.close(); // Close the Scanner when done
    }
}
