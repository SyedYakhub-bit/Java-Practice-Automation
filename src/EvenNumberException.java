import java.util.Scanner;

public class EvenNumberException {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            checkEven(number);
            System.out.println(number + " is an even number.");
        } catch (IllegalArgumentException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    public static void checkEven(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " is an odd number.");
        }
    }
}
