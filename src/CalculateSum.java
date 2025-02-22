import java.util.Scanner;
public class CalculateSum{
    public static void main(String[] args){
        System.out.println("Enter the value of a");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("Enter the value of b");
        int b = scanner.nextInt();
        int sum=a+b;
        System.out.println("The Sum of a and b is "+sum);
    }
}