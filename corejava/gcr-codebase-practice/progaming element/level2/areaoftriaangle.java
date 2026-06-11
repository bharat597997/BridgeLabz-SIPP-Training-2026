
import java.util.Scanner;

public class areaoftriaangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the base of triangle: ");
        double base = input.nextDouble();
        System.out.println("enter the height of triangle: ");
        double height = input.nextDouble();
        double area = (base*height)/2;
        System.out.println("The area of triangle with base " + base + " and height " + height + " is " + area);
        input.close();
    }
    
}
