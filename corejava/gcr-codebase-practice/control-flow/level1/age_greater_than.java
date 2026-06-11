import java.util.Scanner;

public class age_greater_than {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age > 18){
            System.out.println("the person age is " +age+" and can vote");
        }
        else{
            System.out.println("the person age is " +age+" and  cannot vote");
        }
        input.close();
    }
    
}
