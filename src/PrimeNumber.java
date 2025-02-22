import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        int flag=0;
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=obj1.nextInt();
        for(int i=1;i<=num;i++){
            if(num>2 && num%i==0){
                flag+=1;
            }
        }
        if(flag==2){
            System.out.println("Entered number is a prime number.");
        }
        else{
            System.out.println("Entered number is not a prime number try with other number");
        }

    }
}
