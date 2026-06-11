import java.util.Scanner;

public class remainderandquotient {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number1: ");
        int number1 = input.nextInt();
        System.out.println("enter the number2: ");
        int number2 = input.nextInt();
        int quotient = number1/number2;
        int remainder = number1%number2;
        System.out.println("The quotient is " + quotient + " and the remainder is " + remainder + " of two number " + number1 + " and " + number2);
        input.close();
    }
    
}
