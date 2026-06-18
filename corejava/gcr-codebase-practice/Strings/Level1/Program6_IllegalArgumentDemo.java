import java.util.Scanner;

public class Program6_IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text string (at least 6 chars recommended): ");
        String text = scanner.next();
        
        try {
           
            System.out.println(text.substring(5, 2)); 
        } catch (IllegalArgumentException | StringIndexOutOfBoundsException e) {
            System.out.println( e);
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        
        System.out.println(text.substring(5, 2));
        
        scanner.close();
    }
}