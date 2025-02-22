//import java.util.Scanner;
//
//public class Loops {
//    public static void main(String[] args) {
//        Scanner obj1=new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num= obj1.nextInt();
//        if(num>0){
//            System.out.println("The Entered number "+num+" is positive.");
//        }else{
//            System.out.println("The Entered number "+num+" is negative.");
//        }
//    }
//}

//public class Loops{
//    public static void main(String[] args) {
//        int sum=0;
//        for(int i=1;i<=10;i++){
//            sum=sum+i;
//        }
//        System.out.println("The sum of first 10 natural numbers is "+sum);
//    }
//}

//import java.util.Scanner;
//
//public class Loops {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//
//        int number = scanner.nextInt();
//        int reversedNumber = 0;
//
//        while (number != 0) {
//            int digit = number % 10;
//            reversedNumber = reversedNumber * 10 + digit;
//            number /= 10;
//        }
//
//        System.out.println("Reversed number: " + reversedNumber);
//
//
//    }
//}

//import java.util.Scanner;
//
//public class Loops {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String repeat;
//
//        do {
//            System.out.print("Enter the first number: ");
//            double num1 = scanner.nextDouble();
//
//            System.out.print("Enter the second number: ");
//            double num2 = scanner.nextDouble();
//
//            double sum = num1 + num2;
//            System.out.println("Sum: " + sum);
//
//            System.out.print("Do you want to perform the operation again? (yes/no): ");
//            repeat = scanner.next();
//            repeat=repeat.toLowerCase();
//
//
//        } while (repeat.equals("yes"));
//
//
//        System.out.println("The Sum operation is closed here!");
//
//
//    }
//}
//
//class Demo {
//    int a = 25, b = 21;
//
//    void sum() {
//        if (a > b) {
//            System.out.println(a + " is greater");
//        } else {
//            System.out.println(b + " is greater");
//        }
//    }
//}
//class Loops{
//    public static void main(String[] args) {
//
//        Demo obj1=new Demo();
//        obj1.sum();
//    }
//}

// Java Program to illustrate Inheritance (concise)

import java.io.*;
/*import java.util.Scanner;*/

// Base or Super Class
//class Employee {
//    int salary = 60000;
//}
//
//// Inherited or Sub Class
//class Engineer extends Employee {
//    int benefits = 10000;
//}
//
//// Driver Class
//class Loops {
//    public static void main(String[] args)
//    {
//        Engineer E1 = new Engineer();
//        System.out.println("Salary : " + E1.salary
//                + "\nBenefits : " + E1.benefits);
//    }
//}

/*
class Parent{
    String haircolor1="Black";
    int height1=7;
}


class Child extends Parent{
    String haircolor2="Brown";
    double height2=6.5;

}
public class Loops{
    public static void main(String[] args) {
        Child obj1=new Child();
        System.out.println("The Child has "+obj1.haircolor1+" hair color as dad is having "+ obj1.haircolor2+" Color hair.");
        System.out.println("The Child is having "+obj1.height2+" height as the dad is having "+obj1.height1+" height.");
    }
}*/

import java.util.Scanner;
class Digits {

   public void printsum() {
        Scanner obj1 = new Scanner(System.in);
       System.out.println("Enter the number: ");
        int sum = 0;
        int num = obj1.nextInt();
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num = num / 10;


        }
       System.out.println("The sum of digits is "+sum);

    }
}
public class Loops {
    public static void main(String[] args) {
        Digits sum = new Digits();
        sum.printsum();
    }
}




