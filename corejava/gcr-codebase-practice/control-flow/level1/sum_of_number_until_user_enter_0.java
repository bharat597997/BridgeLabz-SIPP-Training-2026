import java.util.Scanner;

public class sum_of_number_until_user_enter_0 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double userEnteredValue;

        while(true){
            System.out.print("Enter a number (enter 0 to stop): ");
            userEnteredValue = input.nextDouble();

            if(userEnteredValue == 0){
                break;
            }

            total += userEnteredValue;
        }

        System.out.println("The sum of all entered numbers is: " + total);
        input.close();
    }
}

