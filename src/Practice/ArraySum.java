package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");

        int size = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int arrayElements = scanner.nextInt();
            arrayList.add(arrayElements);

        }
        int sum = calculateSum(arrayList);
        System.out.println("The Entered Array is : " + arrayList);
        System.out.println("Sum of elements of the Array is : " + sum);
        scanner.close();
    }

    public static int calculateSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

}
