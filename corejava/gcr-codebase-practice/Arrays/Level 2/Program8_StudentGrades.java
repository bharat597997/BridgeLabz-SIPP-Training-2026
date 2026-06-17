
// Level 2 Program 8 
import java.util.Scanner;

public class Program8_StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[] physics = new int[numStudents];
        int[] chemistry = new int[numStudents];
        int[] maths = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n--- Entering marks for Student " + (i + 1) + " ---");

            System.out.print("Enter Physics marks (0-100): ");
            int p = input.nextInt();
            System.out.print("Enter Chemistry marks (0-100): ");
            int c = input.nextInt();
            System.out.print("Enter Maths marks (0-100): ");
            int m = input.nextInt();

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;

            int totalMarks = physics[i] + chemistry[i] + maths[i];
            percentages[i] = totalMarks / 3.0;

            double pct = percentages[i];
            if (pct >= 80.0) {
                grades[i] = "A";
            } else if (pct >= 70.0 && pct < 80.0) {
                grades[i] = "B";
            } else if (pct >= 60.0 && pct < 70.0) {
                grades[i] = "C";
            } else if (pct >= 50.0 && pct < 60.0) {
                grades[i] = "D";
            } else if (pct >= 40.0 && pct < 50.0) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-12d %-10d %-14.2f %-6s\n",
                    (i + 1),
                    physics[i],
                    chemistry[i],
                    maths[i],
                    percentages[i],
                    grades[i]);
        }
        System.out.println("==========================================================================");

        input.close();
    }
}
