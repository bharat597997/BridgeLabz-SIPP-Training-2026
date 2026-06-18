import java.util.Scanner;

public class Program2_SplitAndCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        int len = 0;
        try {
            while (true) {
                input.charAt(len);
                len++;
            }
        } catch (Exception e) {}

        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;
        int[] spaceIndexes = new int[spaceCount];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (input.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] customSplit = new String[wordCount];
        int start = 0;
        for (int i = 0; i < spaceCount; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < spaceIndexes[i]; j++) {
                sb.append(input.charAt(j));
            }
            customSplit[i] = sb.toString();
            start = spaceIndexes[i] + 1;
        }
        
        StringBuilder sbFinal = new StringBuilder();
        for (int j = start; j < len; j++) {
            sbFinal.append(input.charAt(j));
        }
        customSplit[wordCount - 1] = sbFinal.toString();

        String[] builtInSplit = input.split(" ");

        boolean arraysMatch = true;
        if (customSplit.length != builtInSplit.length) {
            arraysMatch = false;
        } else {
            for (int i = 0; i < customSplit.length; i++) {
                if (!customSplit[i].equals(builtInSplit[i])) {
                    arraysMatch = false;
                    break;
                }
            }
        }

        System.out.println(arraysMatch);
        scanner.close();
    }
}