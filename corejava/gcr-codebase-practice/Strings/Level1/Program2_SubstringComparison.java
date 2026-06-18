import java.util.Scanner;

public class Program2_SubstringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter text: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        
        String customSub = "";
        for (int i = start; i < end; i++) {
            customSub += text.charAt(i);
        }
        
        String builtInSub = text.substring(start, end);
        
        boolean match = true;
        if (customSub.length() != builtInSub.length()) {
            match = false;
        } else {
            for (int i = 0; i < customSub.length(); i++) {
                if (customSub.charAt(i) != builtInSub.charAt(i)) {
                    match = false;
                    break;
                }
            }
        }
        
        System.out.println( customSub);
        System.out.println( builtInSub);
        System.out.println( match);
        
        scanner.close();
    }
}