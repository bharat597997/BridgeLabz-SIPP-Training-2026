import java.util.Scanner;

public class number_of_digit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        while(number != 0){
            number /= 10;
            count++;
        }
        System.out.println("The number of digits in the given number is: "+count);
        input.close();
    }
    
}
