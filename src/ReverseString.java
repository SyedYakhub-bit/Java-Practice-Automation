import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String string = scanner.nextLine();
        // Split the string into words
        String[] words = string.split(" ");

        // Reverse the words
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }

        // Print the reversed string
        System.out.println("The Reversed String is: " + reversedString.toString().trim());
    }
}
