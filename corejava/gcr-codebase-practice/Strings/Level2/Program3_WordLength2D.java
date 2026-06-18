import java.util.Scanner;

public class Program3_WordLength2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        int len = 0;
        try {
            while (true) { input.charAt(len); len++; }
        } catch (Exception e) {}

        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (input.charAt(i) == ' ') spaces++;
        }

        String[] words = new String[spaces + 1];
        int wordIdx = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (input.charAt(i) == ' ') {
                words[wordIdx++] = sb.toString();
                sb.setLength(0);
            } else {
                sb.append(input.charAt(i));
            }
        }
        words[wordIdx] = sb.toString();

        String[][] wordData = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordData[i][0] = words[i];

            int wordLen = 0;
            try {
                while (true) { words[i].charAt(wordLen); wordLen++; }
            } catch (Exception e) {}
            
            wordData[i][1] = String.valueOf(wordLen);
        }
        for (int i = 0; i < wordData.length; i++) {
            int lengthValue = Integer.parseInt(wordData[i][1]);
            System.out.printf(wordData[i][0], lengthValue);
        }
       
        scanner.close();
    }
}