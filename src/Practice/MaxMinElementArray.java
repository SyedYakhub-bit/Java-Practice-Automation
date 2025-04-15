package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxMinElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Array Elements: ");
        int arraySize = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(arraySize);
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Please Enter the " + (i + 1) + " element of the Array: ");
            int arrayElement = scanner.nextInt();
            arrayList.add(arrayElement);
        }
        System.out.println("The Array List is: " + arrayList);
        System.out.println("The Greatest or Maximum number in Array is: " + maxNumber(arrayList));
        System.out.println("The Smallest or Minimum number in Array is: " + minNumber(arrayList));
        scanner.close();


    }

    public static int maxNumber(ArrayList<Integer> arrayList) {
        int max = arrayList.get(0);
        for (int num : arrayList) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int minNumber(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int num : arrayList) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
