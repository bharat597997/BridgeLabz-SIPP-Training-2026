// Level 2 Program 9

import java.util.*;
public class Program9_StudentGrades2D {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
        int numStudents = input.nextInt();
        
        int[][] marks = new int[numStudents][3]; 
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
            
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid input! Marks cannot be negative. Please re-enter details for this student.");
                i--; 
                continue;
            }
            
            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
            
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
        
    
        
        for (int j = 0; j < numStudents; j++) {
            System.out.printf("%-10d %-10d %-12d %-10d %-14.2f %-6s\n", 
                (j + 1), 
                marks[j][0], 
                marks[j][1], 
                marks[j][2], 
                percentages[j], 
                grades[j]
            );
        }
        System.out.println("==========================================================================");
        
        input.close();
    }
}


