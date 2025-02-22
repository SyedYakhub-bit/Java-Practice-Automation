import java.util.Scanner;

public class OddNum {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the size of the array you want to enter:");
        int size= obj1.nextInt();

        int[] array=new int[size];
        //taking input
        System.out.println("Now Enter the elements:");
        for(int i=0;i<size;i++){
            array[i]= obj1.nextInt();
        }
        //checking odd
        System.out.println("The odd numbers from the above list are: ");
        for(int i=0;i< (array.length);i++){
            if (array[i]%2!=0){

                System.out.println(array[i]);

            }
        }



    }
}

