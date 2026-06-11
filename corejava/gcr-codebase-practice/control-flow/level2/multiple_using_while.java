import java.util.Scanner;

public class multiple_using_while {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int i=1;
        while(i*number<100){
            System.out.println(i*number);
            i++;
        }
        input.close();
    }
    
}
