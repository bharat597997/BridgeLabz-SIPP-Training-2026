import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int factorial = 1;
        while(number > 0){
            factorial *= number;
            number--;
        }
        System.out.println("The factorial of "+number+" is: "+factorial);
        input.close();
    }

    
}
