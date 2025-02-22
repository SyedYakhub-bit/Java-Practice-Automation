import java.util.Scanner;

public class TemperatureConv {
    public static void main(String[] args){
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the temperature in Degree celcius: ");
        double temp=obj1.nextDouble();
        double Fahrenheit=(temp*(9.0/5))+32;
        System.out.println("The Temperature "+temp+"C in Fahrenheit is "+Fahrenheit+"F");
    }

}
