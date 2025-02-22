import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] args) {
        System.out.println("Enter the values");
        Scanner obj1=new Scanner(System.in);
        int a= obj1.nextInt();
        int b =obj1.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b);

        } else if (a<b) {
            System.out.println(b+" is greater than "+a);

        }else{
            System.out.println(a+" is equal to "+b);
        }
    }
}
