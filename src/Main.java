/*
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(5, 10);         // Calls the int version of add
        double result2 = calculator.add(2.5, 3.5);   // Calls the double version of add

        System.out.println("Result 1: " + result1); // Output: "Result 1: 15"
        System.out.println("Result 2: " + result2); // Output: "Result 2: 6.0"
    }
}
*/
/*
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating");


    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();       // Inherited method
        car.accelerate();  // Method from the subclass
    }
}
*/

/*public class Main {
    // Define a method at the class level
    public static void methodInsideMain() {
        System.out.println("Inside the methodInsideMain method.");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method.");

        // Call the method defined at the class level
        methodInsideMain();
    }
}*/

/*import java.util.Scanner;

public class Main{
    public static int myMethod(int x,int y){
         return x+y;

    }

    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the values of x and y: ");
        int x=obj1.nextInt();
        int y= obj1.nextInt();
        int result=myMethod(x,y);
        System.out.println("The Sum of the entered numbers is: "+result);
    }
}*/

/*import java.util.Scanner;

public class Main {

    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {
        while (true) {
            Scanner obj1 = new Scanner(System.in);
            System.out.println("Enter the age or 0 to exit: ");

            int age = obj1.nextInt();
            if(age==0){
                break;
            }

            checkAge(age); // Call the checkAge method and pass along an age of 20
        }
    }
}*/

/*import java.util.Scanner;

public class Main{
    static int myMethod(int x,int y){
        return x+y;
    }

    static double myMethod(double r,double s){
        return r/s;
    }
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the values for x,y,r and s: ");
         int x= obj1.nextInt();
        int y= obj1.nextInt();
        double r=obj1.nextDouble();
        double s= obj1.nextDouble();
        int result1=myMethod(x,y);
        double result2=myMethod(r,s);
        System.out.println("The Sum of "+x+" and "+y+" is "+result1);
        System.out.println("The Quotient of "+r+" and "+s+" is "+result2);

    }
}*/

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the String: ");
            String str = obj1.nextLine();
            if (str.equalsIgnoreCase("stop")) {
                break;
            }

            int count = 0; // Initialize count for each input string

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isLetter(c)) {
                    count++;
                }
            }

            System.out.println("There are " + count + " letters in the entered string.");
        }
    }
}
*/


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import static java.util.Arrays.stream;

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the marks or 0 to exit");
            int marks = obj1.nextInt();
            if(marks==0){
                break;
            }
            switch (marks) {
                case 100:
                    System.out.println("Grade A");
                    break;

                case 85:
                    System.out.println("Grade B");
                    break;
                case 70:
                    System.out.println("Grade C");
                    break;
                case 60:
                    System.out.println("Grade D");
                    break;

                case 45:
                    System.out.println("Grade E");
                    break;

                case 35:
                    System.out.println("Grade F");
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
*/
/*public class Main{
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the month you want to know the days in it: ");
        String str= obj1.nextLine();
        switch (str.toLowerCase()){
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("There are 31 days in "+str);
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("30 days");
                break;
            case "february":
                System.out.println("28 or 29 days");
                break;
            default:
                System.out.println("Invalid input.");
            }

        }
    }*/


/*
public class Main {
    public static void main(String[] args) {
        *//*Scanner obj1 = new Scanner(System.in);
        int num = obj1.nextInt();*//*
        int num=5;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/*
import java.util.*;
public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<String> str=new ArrayList<>();
        ArrayList<Double> list1=new ArrayList<>();

        list1.add(23.45);
        list.add(27);
        list1.add(23.467);
        str.add("Syed Yakhub");
        str.add("Abbas");

        list.add(20);
        list.add(35);
        list.add(24);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+1);
        }
        System.out.println(list);
        System.out.println(str);
        System.out.println(list1.get(1));
        list.add(2,78);
        list.set(1,2);
        System.out.println(list);
        System.out.println();
        Collections.sort(list);
        System.out.println(list);
    }
}
*/

/*public class Main {
    public static void main(String[] args) {
        // Converting String to int
        String str = "123";
        int intValue;

        try {
            intValue = Integer.parseInt(str);
            System.out.println("String to int: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Unable to parse the string as an integer.");
        }

        // Converting int to String
        int number = 456;
        String strValue = String.valueOf(number);
        System.out.println("int to String: " + strValue);
    }
}*/

/*public class Main{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size= obj1.nextInt();
        System.out.println("Enter the number:");
        for(int i=0;i<size;i++){

            int num= obj1.nextInt();
            set.add(num);
        }
        System.out.println("The set is: "+set);

    }
}*/

/*import java.util.*;
public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(23);
        list.add(87);
        list.add(293);
        list.add(234);
        int sum=0;
        System.out.println(list);
        for(int i=0;i< list.size();i++){
            sum=sum+ list.get(i);
        }
        int max=Collections.max(list);
        System.out.println("The sum of list is "+sum);
        System.out.println("Maximum number is: "+max);


    }
}*/

/*import java.util.*;
public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(87);
        list.add(293);
        list.add(233839);
        System.out.println(list);

        int max = MaxNumber(list);
        System.out.println(max);

    }
                public static int MaxNumber(ArrayList<Integer> list) {
            if (list.contains(234)) {
                System.out.println("Yes the number exists");
            }
            return Collections.max(list);



    }
}*/

/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        int size=list.size();
        for(int i=0;i< list.size();i++){
            list.set(i,list.get(size-1-i));
        }
        System.out.println(list);


    }
}
*/

import java.util.*;
/*
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner obj1 = new Scanner(System.in);

        System.out.println("Enter the elements for list: ");
        for (int i = 0; i < 5; i++) {
            int num = obj1.nextInt();
            list.add(num);

        }
        System.out.println(list);
        for (int i = 0; i < list.size() - 1; i++) {
            int num = list.get(i);
            if (num % 3 == 0) {

                list.remove(Integer.valueOf(num));
            }


        }
        System.out.println(list);
    }
}*/

/*public class Main {
    public static void main(String[] args) {

        HashSet<String> set=new HashSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Papaya");
        set.add("Orange");
        System.out.println(set);
        System.out.println("The size of set is "+set.size());


            System.out.println(set.contains("Papaya"));
        set.remove("Apple");
        System.out.println(set);
        Iterator it=set.iterator();
        for(int i=0;i<set.size();i++) {
            System.out.println(it.next());
        }
    }
    }*/

/*public class Main {
    static void checkAge(int age) throws InputMismatchException {
        if (age < 18) {

            System.out.println("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age= obj1.nextInt();
        checkAge(age); // Set age to 15 (which is below 18...)
    }
}*/

abstract class Animal{
    abstract void walk();


}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken walks with 2 legs");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Horse walks with 4 legs");
    }
}

public class Main{
    public static void main(String[] args) {
        Chicken chicken=new Chicken();
        chicken.walk();
        Horse horse=new Horse();
        horse.walk();
    }
}




