import java.util.Scanner;
import java.util.Arrays;

public class Program3_CharArrayComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.next();
       
        char[] customArr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            customArr[i] = text.charAt(i);
        }
        
        char[] builtInArr = text.toCharArray();
        
        boolean arraysMatch = true;
        if (customArr.length != builtInArr.length) {
            arraysMatch = false;
        } else {
            for (int i = 0; i < customArr.length; i++) {
                if (customArr[i] != builtInArr[i]) {
                    arraysMatch = false;
                    break;
                }
            }
        }
        
        System.out.println("Custom Array: " + Arrays.toString(customArr));
        System.out.println("Built-in Array: " + Arrays.toString(builtInArr));
        System.out.println("Arrays match: " + arraysMatch);
        
        scanner.close();
    }
}