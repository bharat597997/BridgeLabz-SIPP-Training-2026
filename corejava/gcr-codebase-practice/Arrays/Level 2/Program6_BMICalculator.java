import java.util.*;

public class Program6_BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons in the team: ");
        int totalPersons = input.nextInt();

        double[] weights = new double[totalPersons];
        double[] heights = new double[totalPersons];
        double[] bmis = new double[totalPersons];
        String[] statuses = new String[totalPersons];

        for (int i = 0; i < totalPersons; i++) {
            System.out.print("Enter weight (in kg): ");
            weights[i] = input.nextDouble();
            System.out.print("Enter height (in meters, e.g., 1.75): ");
            heights[i] = input.nextDouble();

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 25.0) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] >= 25.0 && bmis[i] < 30.0) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        for (int i = 0; i < totalPersons; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-10.2f %-15s\n",
                    (i + 1), weights[i], heights[i], bmis[i], statuses[i]);
        }

        input.close();
    }
}
