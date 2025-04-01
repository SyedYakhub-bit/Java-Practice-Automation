import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReimbursementQuestion {
    public static List<Integer> listOfMoney=new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Enter the number of people claiming the money: ");
        Scanner obj = new Scanner(System.in);
        int numberOfPeople = obj.nextInt();
        int sum = 0;
        double budget = 120;

        for (int i = 0; i < numberOfPeople; i++) {
            int money = obj.nextInt();
            listOfMoney.add(money);
            sum+= money;
        }
        double requiredFactor = budget / sum;
        System.out.println("Distribute the money in order: ");
        System.out.println(listOfMoney);
        for (int i=0;i< listOfMoney.size();i++){
            System.out.println(requiredFactor* listOfMoney.get(i));
        }
        obj.close();

    }
}
