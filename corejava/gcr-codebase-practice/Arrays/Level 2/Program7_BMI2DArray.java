
// Level 2 Program 7
import java.util.Scanner;

public class Program7_BMI2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons in the team: ");
        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\n--- Entering details for Person " + (i + 1) + " ---");
            double weight = 0;
            while (true) {
                System.out.print("Enter weight (in kg): ");
                weight = input.nextDouble();
                if (weight > 0) {
                    personData[i][0] = weight;
                    break;
                }
                System.out.println("Invalid input! Weight must be a positive value. Please try again.");
            }

            double height = 0;
            while (true) {
                System.out.print("Enter height (in meters, e.g., 1.75): ");
                height = input.nextDouble();
                if (height > 0) {
                    personData[i][1] = height;
                    break;
                }
                System.out.println("Invalid input! Height must be a positive value. Please try again.");
            }

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            double currentBmi = personData[i][2];
            if (currentBmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (currentBmi >= 18.5 && currentBmi < 25.0) {
                weightStatus[i] = "Normal weight";
            } else if (currentBmi >= 25.0 && currentBmi < 30.0) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-10.2f %-15s\n",
                    (i + 1),
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]);
        }
        System.out.println("==============================================================");

        input.close();
    }
}