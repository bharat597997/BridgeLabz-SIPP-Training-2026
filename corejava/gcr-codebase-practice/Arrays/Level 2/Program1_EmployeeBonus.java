import java.util.Scanner;

public class Program1_EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] emp = new double[10][2];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            emp[i][0] = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            emp[i][1] = sc.nextDouble();

            if (emp[i][0] <= 0 || emp[i][1] < 0) {
                System.out.println("Invalid Input! Enter Again.");
                i--;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (emp[i][1] > 5) {
                bonus[i] = emp[i][0] * 0.05;
            } else {
                bonus[i] = emp[i][0] * 0.02;
            }

            newSalary[i] = emp[i][0] + bonus[i];

            totalOldSalary += emp[i][0];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee Details");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                    " Old Salary = " + emp[i][0] +
                    " Bonus = " + bonus[i] +
                    " New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}