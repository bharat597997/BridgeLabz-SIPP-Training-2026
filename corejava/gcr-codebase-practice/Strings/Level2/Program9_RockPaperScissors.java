import java.util.Scanner;

public class Program9_RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int userWin = 0;
        int compWin = 0;
        for (int i = 1; i <= games; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.next();
            int n = (int) (Math.random() * 3);
            String comp = "";
            if (n == 0) {
                comp = "rock";
            } else if (n == 1) {
                comp = "paper";
            } else {
                comp = "scissors";
            }
            String result = "";
            if (user.equals(comp)) {
                result = "Draw";
            } else if ((user.equals("rock") && comp.equals("scissors")) ||
                    (user.equals("paper") && comp.equals("rock")) ||
                    (user.equals("scissors") && comp.equals("paper"))) {
                result = "User";
            } else {
                result = "Computer";
            }
            System.out.println("Computer: " + comp);
            System.out.println("Winner: " + result);

            if (result.equals("User"))
                userWin++;
            else if (result.equals("Computer"))
                compWin++;
        }

        System.out.println("\nUser Wins = " + userWin);
        System.out.println("Computer Wins = " + compWin);

        double userPercent = (userWin * 100.0) / games;
        double compPercent = (compWin * 100.0) / games;

        System.out.println("User Win % = " + userPercent);
        System.out.println("Computer Win % = " + compPercent);

        sc.close();
    }
}