import java.util.Scanner;

public class Functions {

    public static void printMyName(String name){
        System.out.println(name);

    }
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        String name=obj1.next();

        printMyName(name);


    }
}
