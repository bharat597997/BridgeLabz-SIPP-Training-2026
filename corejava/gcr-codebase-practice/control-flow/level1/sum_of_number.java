import java.util.Scanner;

public class sum_of_number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number > 0){
            System.out.println("The number is: "+number);
        int sum = 0;
        for(int i=1; i<=number; i++){
            sum += i;
        }
        System.out.println("The sum of first "+number+" natural number is: "+sum);
        input.close();
    }
    
}
