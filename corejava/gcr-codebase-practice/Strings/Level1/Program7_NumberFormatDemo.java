import java.util.Scanner;

public class Program7_NumberFormatDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an invalid numeric string (e.g., 'abc'): ");
        String text = scanner.next();
        
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught Number Format Exception: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught Generic Runtime Exception: " + e);
        }
  
        int num = Integer.parseInt(text);
        System.out.println("Parsed number: " + num);
        
        scanner.close();
    }
}