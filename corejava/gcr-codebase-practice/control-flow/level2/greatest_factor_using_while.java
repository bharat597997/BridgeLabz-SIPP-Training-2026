import java.util.Scanner;

public class greatest_factor_using_while {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatest_factor = 1;
        int counter = 1;
        while(counter <= number/2){
            if(number % counter == 0){
                greatest_factor = counter;
            }
            counter++;
        }
        System.out.println("The greatest factor of " + number + " is: " + greatest_factor);
        input.close();
    }
    
}
