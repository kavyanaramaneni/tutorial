package Nodce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DigitSumsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> array = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }

        // Sort the array based on the sum of digits
        Collections.sort(array, (Integer a, Integer b) -> {
            int sum1 = getDigitSum(a);
            int sum2 = getDigitSum(b);

            // If the sums are equal, sort by the original number
            if (sum1 == sum2) {
                return a.compareTo(b);
            }
            // Otherwise, sort by the sum of digits
            return Integer.compare(sum1, sum2);
        });

        System.out.println("Sorted output based on digit sum:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        sc.close();
    }

    public static int getDigitSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    
}
