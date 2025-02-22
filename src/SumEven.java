import java.util.Scanner;

public class SumEven {
    public  static void main(String[] args){
        Scanner obj1=new Scanner(System.in);

        System.out.println("Enter a positive number");

        int num=obj1.nextInt();
        int sum = 0;
        for(int i=1;i<= num;i++){
            if(i%2==0){
                sum=sum+i;
            }

        }
        System.out.println("The sum of even numbers from 1 to "+num+ " is "+sum);
    }
}
