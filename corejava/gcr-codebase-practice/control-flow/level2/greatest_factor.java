import java.util.Scanner;
public class greatest_factor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatest_factor = 1;
        for(int i = 1; i <= number/2; i++){
            if(number % i == 0){
                greatest_factor = i;
            }
        }
        System.out.println("The greatest factor of " + number + " is: " + greatest_factor);
        input.close();
    }
    
}
