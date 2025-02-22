package Practice;
import java.util.Scanner;

public class NewPractice {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the values of a,b and c: ");
        int a= obj1.nextInt();
        int b= obj1.nextInt();
        int c= obj1.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greater");
        }else if(b>a && b>c){
            System.out.println(b+ " is greater");
        }else{
            System.out.println(c+" is greater");
        }
    }
}


