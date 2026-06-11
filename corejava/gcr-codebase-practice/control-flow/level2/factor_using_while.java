import java.util.Scanner;

public class factor_using_while {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Factors of " + number + " are:");
        int i = 1;
        while(i <= number){
            if(number % i == 0){
                System.out.println(i);
            }
            i++;
        }
        input.close();
    }
    
}
