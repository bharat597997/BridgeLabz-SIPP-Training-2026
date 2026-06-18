import java.util.Scanner;

public class Program1_BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter Details of Person " + (i + 1));
            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = sc.nextDouble();
        }
        String[][] report = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            report[i][0] = String.valueOf(heightCm);
            report[i][1] = String.valueOf(weight);
            report[i][2] = String.valueOf(bmi);
            report[i][3] = status;
        }
        System.out.println("\n----------------------------------------------------------");
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < report.length; i++) {
            System.out.println(
                    report[i][0] + "\t\t" +
                    report[i][1] + "\t\t" +
                    report[i][2] + "\t\t" +
                    report[i][3]
            );
        }
        
        sc.close();
    }
}