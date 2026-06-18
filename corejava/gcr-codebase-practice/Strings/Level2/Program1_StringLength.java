import java.util.Scanner;

public class Program1_StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single word: ");
        String input = scanner.next();

        int customLength = 0;
        try {
            while (true) {
                input.charAt(customLength);
                customLength++;
            }
        } catch (StringIndexOutOfBoundsException e) {
  
        }

        int builtInLength = input.length();

        System.out.println("Custom Logic Length: " + customLength);
        System.out.println("Built-in Method Length: " + builtInLength);
        scanner.close();
    }
}