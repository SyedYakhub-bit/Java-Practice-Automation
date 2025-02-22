import java.util.Scanner;

interface DisplayShape {
    String display(String shape);
}

interface Shape extends DisplayShape {
    Double calculateArea();
}

public class Circle implements Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String display(String shape) {
        return "We are calculating the area of " + shape;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the shape you want to calculate Area");
        String shapeName = scanner.nextLine();

        if ("circle".equalsIgnoreCase(shapeName)) {
            Circle circle = new Circle();
            System.out.println(circle.display(shapeName));
            System.out.println("Enter the radius of the circle");

            // Read and set the radius from user input
            double radius = scanner.nextDouble();
            circle.setRadius(radius);

            System.out.println("Area of Circle is " + circle.calculateArea());
        } else {
            System.out.println("Unsupported shape.");
        }
    }
}
