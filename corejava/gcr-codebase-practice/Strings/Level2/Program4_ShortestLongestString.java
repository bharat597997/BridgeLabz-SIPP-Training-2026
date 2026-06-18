import java.util.Scanner;

public class Program4_ShortestLongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        int len = 0;
        try {
            while (true) { input.charAt(len); len++; }
        } catch (Exception e) {}

        int spaces = 0;
        for (int i = 0; i < len; i++) if (input.charAt(i) == ' ') spaces++;
        
        String[] words = new String[spaces + 1];
        int currentWord = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (input.charAt(i) == ' ') {
                words[currentWord++] = sb.toString();
                sb.setLength(0);
            } else {
                sb.append(input.charAt(i));
            }
        }
        words[currentWord] = sb.toString();

        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            int wLen = 0;
            try {
                while (true) { words[i].charAt(wLen); wLen++; }
            } catch (Exception e) {}
            data[i][1] = String.valueOf(wLen);
        }
        int minIdx = 0, maxIdx = 0;
        int minLen = Integer.parseInt(data[0][1]);
        int maxLen = Integer.parseInt(data[0][1]);

        for (int i = 1; i < data.length; i++) {
            int currentLen = Integer.parseInt(data[i][1]);
            if (currentLen < minLen) {
                minLen = currentLen;
                minIdx = i;
            }
            if (currentLen > maxLen) {
                maxLen = currentLen;
                maxIdx = i;
            }
        }

        System.out.println("Shortest Word: " + data[minIdx][0] + " (Length: " + data[minIdx][1] + ")");
        System.out.println("Longest Word: " + data[maxIdx][0] + " (Length: " + data[maxIdx][1] + ")");
        scanner.close();
    }
}