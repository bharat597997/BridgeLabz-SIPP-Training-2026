import java.util.Scanner;   
public class youngest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Akabr_age = input.nextInt();
        int Amar_age = input.nextInt();
        int Anthony_age = input.nextInt();
        if(Akabr_age < Amar_age && Akabr_age < Anthony_age){
            System.out.println("The youngest is: " + Akabr_age);
        } else if(Amar_age < Akabr_age && Amar_age < Anthony_age){
            System.out.println("The youngest is: " + Amar_age);
        } else {
            System.out.println("The youngest is: " + Anthony_age);
        }
        input.close();
    }
    
}
