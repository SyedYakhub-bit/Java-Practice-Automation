import java.util.Scanner;

class Vowels{
    //String str;

    public int PrintVowels(){
        Scanner obj1=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the string: ");
        String str= obj1.nextLine();
        str=str.toLowerCase();
        char[] array=str.toCharArray();
        for (char c : array) {
            if (c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
public class AccessModifiers{
    public static void main(String[] args) {
        Vowels ref=new Vowels();
        System.out.println("The number of vowels in the entered string is "+ref.PrintVowels());

    }
}
