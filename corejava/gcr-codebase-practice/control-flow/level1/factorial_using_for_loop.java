import java.util.Scanner;

public class factorial_using_for_loop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int factorial = 1;
        for(int i=1; i<=number; i++){
            factorial *= i;
        }
        System.out.println("The factorial of "+number+" is: "+factorial);
        input.close();
    }
    
}
