import java.util.Scanner;

public class untli_number_is_negative {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double userEnteredValue;

        while(true){
            System.out.print("Enter a number (enter a negative number to stop): ");
            userEnteredValue = input.nextDouble();

            if(userEnteredValue < 0 || userEnteredValue == 0){
                break;
            }
        }

        System.out.println("You entered a negative number: " + userEnteredValue);
        input.close();
    }
    
}
