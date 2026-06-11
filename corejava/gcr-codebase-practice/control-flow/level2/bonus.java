import java.util.Scanner;

public class bonus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int services = input.nextInt();
        int salary = input.nextInt();
        if(services > 5){
           int bonus = (salary * 5) / 100;
            System.out.println(bonus);
        } 
        input.close();
    }
    
}
