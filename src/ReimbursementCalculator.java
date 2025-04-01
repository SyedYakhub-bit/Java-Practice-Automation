import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReimbursementCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> claims = new ArrayList<>();

        System.out.print("Enter the number of people claiming money: ");
        int numberOfPeople = scanner.nextInt();

        int totalClaim = 0;
        for (int i = 1; i <= numberOfPeople; i++) {
            System.out.print("Enter claim amount for person " + i + ": ");
            int money = scanner.nextInt();
            claims.add(money);
            totalClaim += money;
        }

        if (totalClaim == 0) {
            System.out.println("No valid claims entered.");
            return;  // Avoid division by zero
        }

        distributeMoney(claims, totalClaim);
        scanner.close();
    }

    private static void distributeMoney(List<Integer> claims, int totalClaim) {
        double factor = (double) 120 / totalClaim;
        System.out.println("\nDistributed amounts:");

        claims.forEach(claim ->
                System.out.printf("₹%.2f%n", claim * factor)
        );
    }
}
