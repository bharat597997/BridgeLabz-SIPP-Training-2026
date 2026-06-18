

import java.util.Scanner;

public class Program7_PalindromeCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        // --- Logic 1: Loop ---
        int start1 = 0;
        int end1 = text.length() - 1;
        boolean result1 = true;

        while (start1 < end1) {
            if (text.charAt(start1) != text.charAt(end1)) {
                result1 = false;
                break;
            }
            start1++;
            end1--;
        }

        // --- Logic 2: Inline Recursion Simulation ---
        int start2 = 0;
        int end2 = text.length() - 1;
        boolean result2 = true;

        while (true) {
            if (start2 >= end2) {
                result2 = true;
                break;
            }
            if (text.charAt(start2) != text.charAt(end2)) {
                result2 = false;
                break;
            }
            start2++;
            end2--;
        }

        // --- Logic 3: Array Reversal ---
        char[] original = text.toCharArray();
        char[] reverse = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }

        boolean result3 = true;
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                result3 = false;
                break;
            }
        }

        System.out.println("Logic 1 : " + result1);
        System.out.println("Logic 2 : " + result2);
        System.out.println("Logic 3 : " + result3);

        sc.close();
    }
}