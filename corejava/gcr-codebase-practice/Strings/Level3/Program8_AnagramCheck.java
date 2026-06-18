import java.util.Scanner;

public class Program8_AnagramCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Text: ");
        String s1 = sc.nextLine();

        System.out.print("Enter Second Text: ");
        String s2 = sc.nextLine();

        boolean result = true;

        if (s1.length() != s2.length()) {
            result = false;
        } else {
            int[] freq1 = new int[256];
            int[] freq2 = new int[256];

            for (int i = 0; i < s1.length(); i++) {
                freq1[s1.charAt(i)]++;
                freq2[s2.charAt(i)]++;
            }

            for (int i = 0; i < 256; i++) {
                if (freq1[i] != freq2[i]) {
                    result = false;
                    break;
                }
            }
        }

        if (result)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        sc.close();
    }
}