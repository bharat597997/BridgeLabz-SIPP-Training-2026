import java.util.Scanner;

public class Program5_StringIndexDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.next();
        
        System.out.println("--- Scenario 1: Handling Exception ---");
        try {
            
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught String Index Exception: " + e);
        }
        
        System.out.println("\n--- Scenario 2: Generating Crash (Abrupt End) ---");
        System.out.println(text.charAt(text.length())); 
        
        scanner.close();
    }
}