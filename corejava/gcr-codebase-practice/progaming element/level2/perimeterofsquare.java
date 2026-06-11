
import java.util.Scanner;

public class perimeterofsquare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the side of square: ");
        double side = input.nextDouble();
        double perimeter = 4 * side;
        System.out.println("The perimeter of square with side " + side + " is " + perimeter);
        input.close();
    }
    
}
