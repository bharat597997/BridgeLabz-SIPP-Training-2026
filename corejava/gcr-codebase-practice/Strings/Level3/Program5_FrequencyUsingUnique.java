import java.util.Scanner;

public class Program5_FrequencyUsingUnique {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char[] temp = new char[text.length()];
        int size = 0;

        for (int i = 0; i < text.length(); i++) {

            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[size++] = text.charAt(i);
            }
        }

        char[] unique = new char[size];

        for (int i = 0; i < size; i++) {
            unique[i] = temp[i];
        }

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {

            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (unique[i] == text.charAt(j))
                    count++;
            }

            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(count);
        }

        System.out.println("Character\tFrequency");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }

        sc.close();
    }
}