import java.util.Scanner;

public class Program10_ToLowerCaseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full text sentence: ");
        String text = scanner.nextLine();
       
        String customLower = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                customLower += (char) (ch + 32);
            } else {
                customLower += ch;
            }
        }
        
        String builtInLower = text.toLowerCase();
   
        boolean match = true;
        if (customLower.length() != builtInLower.length()) {
            match = false;
        } else {
            for (int i = 0; i < customLower.length(); i++) {
                if (customLower.charAt(i) != builtInLower.charAt(i)) {
                    match = false;
                    break;
                }
            }
        }
        
        System.out.println( customLower);
        System.out.println( builtInLower);
        System.out.println(match);
        
        scanner.close();
    }
}