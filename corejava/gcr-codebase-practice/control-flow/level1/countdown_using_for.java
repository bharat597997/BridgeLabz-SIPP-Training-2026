import java.util.Scanner;

public class countdown_using_for {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();
        for(int i = counter; i >= 0; i--){
            System.out.println(i);
        }
        input.close();
    }
    
}
