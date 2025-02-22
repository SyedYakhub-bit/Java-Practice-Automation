//import java.util.Scanner;
//
//class Student{
//    String name;
//    int age;
//    double marks;
//
//
//    public Student(String name,int age,double marks){
//
//        this.name=name;
//        this.age=age;
//        this.marks=marks;
//    }
//    public void display(){
//
//        System.out.println("Name of the student is "+name);
//        System.out.println("Age of the student is "+age);
//        System.out.println("Marks of the student is "+marks);
//    }
//}
//public class OopsPractice{
//    public static void main(String[] args) {
//
//        Student student1=new Student("Syed",23,98);
//        student1.display();
//
//    }
//}

//class OopsPractice{
//    public static void Sum(){
//        int a=20,b=45;
//        System.out.println(a+b);
//    }
//
//    public static void main(String[] args) {
//        OopsPractice.Sum();
//    }
//}

//import java.util.Scanner;
//
//public class OopsPractice {
//    public static void main(String[] args) {
//        Scanner obj1=new Scanner(System.in);
//        String string= obj1.next();
//
//        StringBuilder reversed = new StringBuilder(string).reverse();
//        String result = reversed.toString();
//        System.out.println("Original: " + string);
//        System.out.println("Reversed: " + result);
//        if(string.equals(result)){
//            System.out.println("Is palindrome");
//        }else
//        {
//            System.out.println("Not a palindrome");
//        }
//    }
//}

//import java.util.Scanner;
//
//public class OopsPractice{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String input = scanner.nextLine();
//        scanner.close();
//
//        int vowelCount = 0;
//        int consonantCount = 0;
//        int digitCount = 0;
//        int whitespaceCount = 0;
//
//        input = input.toLowerCase(); // Convert to lowercase to handle both uppercase and lowercase characters
//
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//
//            if (ch >= 'a' && ch <= 'z') {
//                // Check for vowels (a, e, i, o, u)
//                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                    vowelCount++;
//                } else {
//                    consonantCount++;
//                }
//            } else if (ch >= '0' && ch <= '9') {
//                digitCount++;
//            } else if (Character.isWhitespace(ch)) {
//                whitespaceCount++;
//            }
//        }
//
//        System.out.println("Vowels: " + vowelCount);
//        System.out.println("Consonants: " + consonantCount);
//        System.out.println("Digits: " + digitCount);
//        System.out.println("Whitespace: " + whitespaceCount);
//    }
//}

//import java.util.Scanner;
//
//class Student {
//    String name;
//    double marks;
//
//    public void PrintInfo() {
//        System.out.println("The Student "+this.name+" has scored "+this.marks+" marks.");
//
//    }
//}
//    public class OopsPractice{
//        public static void main(String[] args) {
//            Scanner obj1=new Scanner(System.in);
//
//            Student student=new Student();
//            System.out.println("Enter the marks of the student: ");
//            double marks= obj1.nextDouble();
//            obj1.nextLine();
//            System.out.println("Enter the name of the student: ");
//            String name=obj1.nextLine();
//            obj1.nextLine();
//            student.marks=marks;
//            student.name=name;
//
//            student.PrintInfo();
//        }
//    }

//public class OopsPractice {
//    public static void main(String[] args) {
//        try {
//            int result = 10/0;
//            System.out.println("Result: " + result);
//        } catch(ArithmeticException e)  {
//            System.out.println("Error: Division by zero");
//        }
//    }
//}
import java.util.Scanner;
public class OopsPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine(); //this will take the input as string
        int count =0,i=0;  //initialize the value of count and i to 0
        char[] ch = str.toCharArray();   //converts the entered string to array
        System.out.println("The String contains "+ ch.length+" Characters with: ");
        for (i=0; i<ch.length; i++){
            count =0;
            for (int j=0;j< ch.length;j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            System.out.println(ch[i]+" Count "+count);
        }
    }
}


