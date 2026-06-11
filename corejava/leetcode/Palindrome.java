import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");

        int n = input.nextInt();
        int reverse = 0;
        int temp =n;

        if(n<0){
           System.out.println("Negative numbers are not palindromes.");
           return;

        }
        while(n>0){
            reverse =(reverse*10 )+ (n%10);
            n=n/10;
        }
        if(temp==reverse){
            System.out.println(temp + " is a palindrome.");
        }
        else{
            System.out.println(temp + " is not a palindrome.");
        }
 
    }
    
}
