import java.util.Scanner;

public class Program5_VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        int vowelsCount = 0;
        int consonantsCount = 0;
        int index = 0;

        try {
            while (true) {
                char ch = input.charAt(index);
                
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 32);
                }

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else if (ch >= 'a' && ch <= 'z') {
                    consonantsCount++;
                }
                
                index++;
            }
        } catch (Exception e) {}

        System.out.println("Vowels Count: " + vowelsCount);
        System.out.println("Consonants Count: " + consonantsCount);
        scanner.close();
    }
}