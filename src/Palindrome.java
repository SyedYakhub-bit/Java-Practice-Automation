import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        System.out.println("Enter a string:");
        Scanner obj1=new Scanner(System.in);
        String input=obj1.nextLine();
        String lowercase=input.toLowerCase();
        // Create a StringBuilder and initialize it with the original string
        StringBuilder reversedString = new StringBuilder(lowercase);

        // Use the reverse() method of StringBuilder to reverse the string
        reversedString.reverse();

        // Convert the StringBuilder back to a String
        String result = reversedString.toString();
        if(lowercase.equals(result)){
            System.out.println("Entered String is a Palindrome String");


        }
        else {
            System.out.print("Please enter different string the entered string is not a palindrome string.");
        }
    }
}
