import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter the number you want:");
        Scanner obj1 = new Scanner(System.in);
        int a = obj1.nextInt();
        switch (a) {
            case 1:
                System.out.println("Syed");
                break;
            case 2:
                System.out.println("Usman");
                break;
            case 3:
                System.out.println("Abbas");
                break;
                case 4:
                System.out.println("Siddiq");
                break;
            default:
                System.out.println("Nothing");
        }
    }
}
