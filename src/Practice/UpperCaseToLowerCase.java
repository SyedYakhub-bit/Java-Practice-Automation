package Practice;

import java.util.Scanner;

public class UpperCaseToLowerCase {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the string you want to convert to lower case: ");
        String string=scanner.nextLine();
        scanner.close();
        System.out.println("The String is Converted to lower case: "+string.toLowerCase());
    }
}
