import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner obj1 = new Scanner(System.in);
        int num = obj1.nextInt();
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;


        if (num == randomNumber) {
            System.out.println("You Guessed it right.");

        } else {
            System.out.println("Sorry! try again,the random number is " + randomNumber);
        }
    }

}

