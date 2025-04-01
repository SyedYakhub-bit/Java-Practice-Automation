import java.util.Scanner;

public class StringDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String you want to find the duplicates: ");
        String string = input.nextLine();
        input.close(); // Close scanner after taking input

        String trimmedString = string.trim().toLowerCase();
        char[] charArray = trimmedString.toCharArray();

        System.out.println("Duplicate characters in the given string \"" + string + "\":");

        // To ensure we don't print the same duplicate multiple times
        boolean[] seen = new boolean[256];  // To track printed characters
int count=0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') continue; // Ignore spaces
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j] && !seen[charArray[i]]) {
                    count++;
                    System.out.println(charArray[i]+ " occurs "+count+ " times.");
                    seen[charArray[i]] = true; // Mark as printed
                    break; // Avoid multiple prints
                }
            }
        }
    }
}
