import java.util.Scanner;

public class distanceinmileandyaard {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a distance in km: ");
        double km = input.nextDouble();
        double miles = km * 1.6;
        double yards = km * 1093.61;
        System.out.println("The Distance in yard is " + yards + " and in miles is " + miles);
        input.close();

    }
    
}
