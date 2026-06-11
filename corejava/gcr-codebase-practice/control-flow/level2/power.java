import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int exponent = input.nextInt();
        int result = 1;
        for(int i = 0; i < exponent; i++){
            result *= base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        input.close();
    }
}
