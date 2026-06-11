 import java.util.Scanner;
 public class kilometer_to_miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("enter a distance in km: ");
        double km = input.nextDouble();

        System.out.println("The total miles is " + (km * 1.6) + " miles for the given " + km + " km");
        input.close();
    
}
 }