import java.util.Scanner;
public class height_in_inches {
    public static void main(String[] args) {
        Scanner input = new canner(System.in);
    System.out.println("enter your height in cm:");

        int height = input.nextInt();
        float inches = height/2.54f;
        float feet = inches/12;
        System.out.println("Your height in cm is " + height + " and in feet is " + feet + " and in inches is " + inches);

      input.close();
    }
    
}
    
