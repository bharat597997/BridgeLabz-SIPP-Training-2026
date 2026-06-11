import java.util.Scanner;

public class fizzbuzz_while {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while(number>0){
            if(number %15 ==0){
                System.out.println("FizzBuzz");
            } else if(number % 3 == 0){
                System.out.println("Fizz");
            } else if(number % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
            number--;
        }
        input.close();
    }
    
}
