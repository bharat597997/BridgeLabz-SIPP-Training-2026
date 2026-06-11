import java.util.Scanner;
public class intoperation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int c = input.nextInt();
        int result = a + b * c;
        int result1 = a * b + c;    
        int result2 = c + a / b;
        int result3 = a % b + c;
        System.out.println("The result of a + b * c is " + result);
        System.out.println("The result of a * b + c is " + result1);
        System.out.println("The result of c + a / b is " + result2);
        System.out.println("The result of a % b + c is " + result3);
        input.close();
    }
    
}
