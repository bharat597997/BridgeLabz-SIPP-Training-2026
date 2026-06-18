import java.util.Scanner;

public class Program9_ToUpperCaseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full text sentence: ");
        String text = scanner.nextLine();
        
        String customUpper = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                customUpper += (char) (ch - 32);
            } else {
                customUpper += ch;
            }
        }
        
        String builtInUpper = text.toUpperCase();
    
        boolean match = true;
        if (customUpper.length() != builtInUpper.length()) {
            match = false;
        } else {
            for (int i = 0; i < customUpper.length(); i++) {
                if (customUpper.charAt(i) != builtInUpper.charAt(i)) {
                    match = false;
                    break;
                }
            }
        }
        
        System.out.println( customUpper);
        System.out.println(builtInUpper);
        System.out.println(match);
        
        scanner.close();
    }
}