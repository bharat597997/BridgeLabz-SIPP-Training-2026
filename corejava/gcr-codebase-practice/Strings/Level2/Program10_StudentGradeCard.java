import java.util.Scanner;

public class Program10_StudentGradeCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int students = sc.nextInt();

        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 100);
            }
        }

        double[][] result = new double[students][3];
        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        String[] grade = new String[students];
        for (int i = 0; i < students; i++) {
            double per = result[i][2];

            if (per >= 80)
                grade[i] = "A";
            else if (per >= 70)
                grade[i] = "B";
            else if (per >= 60)
                grade[i] = "C";
            else if (per >= 50)
                grade[i] = "D";
            else if (per >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }

        System.out.println("\nStu\tPhy\tChem\tMath\tTotal\tAvg\tPer\tGrade");
        for (int i = 0; i < students; i++) {
            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                (int)result[i][0] + "\t" +
                String.format("%.2f", result[i][1]) + "\t" +
                result[i][2] + "\t" +
                grade[i]
            );
        }

        sc.close();
    }
}