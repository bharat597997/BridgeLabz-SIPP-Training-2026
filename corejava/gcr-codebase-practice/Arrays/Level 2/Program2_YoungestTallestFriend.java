// Level 2 Program 2 - Youngest and Tallest Friend
import java.util.*;
public class Program2_YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 3;
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[n];
        double[] heights = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of " + names[i] + " in cm: ");
            heights[i] = input.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < n; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        input.close();
    }
}
