import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);

        System.out.println("Enter the year");


            int year = obj1.nextInt();
            if ((year % 4 == 0 && year%100!=0) || year % 400 == 0 ) {
                System.out.println(year + " is a Leap year");
            }
             else {
                System.out.println(year + " is not a Leap year please enter other number.");
            }


    }
}

