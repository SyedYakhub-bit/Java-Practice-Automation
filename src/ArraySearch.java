import java.util.Scanner;   //importing Scanner

public class ArraySearch {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);  //Creating the scanner
        System.out.println("Enter the size of the array:");
        int size = obj1.nextInt();    //taking the size from user
        int[] numbers = new int[size];  //initializing the array
        System.out.println("Now Enter the elements of the array:");
        //Take inputs
        for (int i = 0; i < size; i++) {
            numbers[i] = obj1.nextInt();
        }
        System.out.println("Enter the number to be Searched: ");
        int x = obj1.nextInt();   //taking the number to be searched

        for (int i = 0; i < numbers.length; i++) {
            if (x == numbers[i]) {
                System.out.println("The number " + x + " is in  " + (i + 1) + " position of the array.");
            }
        }
    }
}
