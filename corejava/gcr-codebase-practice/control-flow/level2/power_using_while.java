import java.util.Scanner;

public class power_using_while {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int base= input.nextInt();
        int exponent = input.nextInt();
        int result = 1; 
        int i = 0;
        while(i < exponent){
            result *= base;
            i++;
        }           
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        input.close();
    }
    
}
