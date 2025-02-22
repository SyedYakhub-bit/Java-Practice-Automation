import java.util.Scanner;

import static java.lang.Math.round;

public class CircleArea {
    public static void main(String[] args ){
        double value= Math.PI;
        System.out.println("Enter the Radius of the circle: ");
        Scanner obj1 =new Scanner(System.in);
        double radius=obj1.nextDouble();
        double circumference=2*value*radius;
        double area=value*radius*radius;
        System.out.println("The circumference of the circle of radius "+ radius+" is "+round(circumference));
        System.out.println("The Area of the circle of radius " + radius+ " is "+ round(area));


    }
}
