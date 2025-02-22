import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner obj1=new Scanner(System.in);
        int row= obj1.nextInt();
        System.out.println("Enter number of columns");
        int column= obj1.nextInt();
        for(int i=0;i<=row-1;i++){
            for(int j=0;j<=column-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
