import java.util.Scanner;

public class Program6_FrequencyNestedLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {

            freq[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {

                if (chars[i] == chars[j]) {

                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        String[] result = new String[chars.length];

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != '0') {
                result[i] = chars[i] + " = " + freq[i];
            }
        }

        for (String s : result) {
            if (s != null)
                System.out.println(s);
        }

        sc.close();
    }
}