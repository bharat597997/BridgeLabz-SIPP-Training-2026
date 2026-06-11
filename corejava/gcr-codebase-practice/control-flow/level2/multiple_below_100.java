import java.util.Scanner;

public class multiple_below_100 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i = 1; i*number < 100; i++){
            System.out.println(i*number);
        }
        input.close();
    }
}
