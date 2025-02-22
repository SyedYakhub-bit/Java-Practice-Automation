
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        int result=1;

        System.out.println("Enter any number: ");
        Scanner scanner=new Scanner(System.in);
        //System.out.println();
        int num=scanner.nextInt();
        while (num>1){
            result=num*result;
            num=num-1;
        }
        System.out.println("The Factorial of entered number is "+result);
    }
}
