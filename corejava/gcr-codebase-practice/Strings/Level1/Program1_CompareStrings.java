
import java.util.Scanner;

public class Program1_CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        boolean customResult = true;
        if (str1.length() != str2.length()) {
            customResult = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    customResult = false;
                    break;
                }
            }
        }
        
        boolean builtInResult = str1.equals(str2);
        
        System.out.println( customResult);
        System.out.println( builtInResult);
        System.out.println((customResult == builtInResult));
        
        scanner.close();
    }

}