import java.util.Scanner;

public class sum_of_natural_no {
    //using while loop
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number>0){
            int sum =0;
            int i=1;
            while(i<=number){
                sum += i;
                i++;

            }
            int result = number*(number+1)/2;
        if(sum==result){
            System.out.println("The sum of first "+number+" natural number is: "+sum);
        }
        else{
            System.out.println("The sum of first "+number+" natural number is: "+result);
        }
        }
        
        
    }
    
}
