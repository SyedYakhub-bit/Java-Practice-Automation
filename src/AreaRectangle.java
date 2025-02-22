import java.util.*;
public class AreaRectangle {
    public static void main(String[] args){
        double area;
        System.out.println("Enter the length of the rectangle: ");
        Scanner obj1=new Scanner(System.in);
        double length=obj1.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        Scanner obj2=new Scanner(System.in);
        double breadth=obj2.nextDouble();
        area = breadth*length;
        System.out.println("The Area of the rectangle is "+area);
    }
}
