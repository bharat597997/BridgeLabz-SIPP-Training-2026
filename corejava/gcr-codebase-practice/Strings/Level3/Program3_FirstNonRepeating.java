import java.util.Scanner;

public class Program3_FirstNonRepeating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char result = '\0';

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                result = text.charAt(i);
                break;
            }
        }

        if (result != '\0')
            System.out.println("First Non-Repeating Character: " + result);
        else
            System.out.println("No Non-Repeating Character Found");

        sc.close();
    }
}