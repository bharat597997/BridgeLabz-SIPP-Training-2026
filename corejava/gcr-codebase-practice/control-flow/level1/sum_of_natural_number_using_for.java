import java.util.Scanner;

public class sum_of_natural_number_using_for {
       public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number>0){
            int sum =0;
            int i=1;
           for(i=1; i<=number; i++){
                sum += i;
                

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
    
}
