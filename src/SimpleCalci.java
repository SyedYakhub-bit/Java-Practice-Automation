import java.util.Scanner;
public class SimpleCalci {
    public static void main(String[] args){
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter number 1:");
        double number1=obj1.nextDouble();
        System.out.println("Enter number 2:");
        double number2= obj1.nextDouble();
        System.out.println("The Sum of "+number1+" and "+number2+" is "+(number1+number2));
        System.out.println("The Difference of "+ number1 + " and " + number2 +" is "+ (number1 - number2));
        System.out.println("The Product of "+number1+" and "+number2+" is "+(number1*number2));
        System.out.println("The Quotient of "+number1+" and "+number2+" is "+(number1/number2));

    }

}
