// Level 2 Program 10

import java.util.Scanner;

public class Program10_DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = input.nextLong();

        n = Math.abs(n);

        long temp = n;
        int count = 0;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
        }

        int[] digitsArray = new int[count];
        temp = n;
        int index = 0;

        if (temp == 0) {
            digitsArray[0] = 0;
        } else {
            while (temp > 0) {
                digitsArray[index] = (int) (temp % 10);
                index++;
                temp = temp / 10;
            }
        }

        int[] frequency = new int[10];

        for (int i = 0; i < digitsArray.length; i++) {
            int digit = digitsArray[i];
            frequency[digit]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.printf("%-10d %-10d\n", i, frequency[i]);
            }
        }

        input.close();
    }
}