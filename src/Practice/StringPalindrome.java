package Practice;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String to check palindrome: ");
        String string=scanner.nextLine();
        StringBuilder stringBuilder=new StringBuilder(string);
        String reversedString= String.valueOf(stringBuilder.reverse());
        if(string.equalsIgnoreCase(reversedString)){
            System.out.println("Given String "+string+" is a palindrome");
        }
        else {
            System.out.println("Given String "+string+" is not a palindrome");
        }
    }
}
