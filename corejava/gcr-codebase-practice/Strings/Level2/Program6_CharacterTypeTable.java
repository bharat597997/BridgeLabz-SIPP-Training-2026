import java.util.Scanner;

public class Program6_CharacterTypeTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();
        int totalLen = 0;
        try {
            while (true) { input.charAt(totalLen); totalLen++; }
        } catch (Exception e) {}

        String[][] characterTable = new String[totalLen][2];

        for (int i = 0; i < totalLen; i++) {
            char ch = input.charAt(i);
            characterTable[i][0] = String.valueOf(ch);

            char processedCh = ch;
            if (processedCh >= 'A' && processedCh <= 'Z') {
                processedCh = (char) (processedCh + 32);
            }

            if (processedCh == 'a' || processedCh == 'e' || processedCh == 'i' || processedCh == 'o' || processedCh == 'u') {
                characterTable[i][1] = "Vowel";
            } else if (processedCh >= 'a' && processedCh <= 'z') {
                characterTable[i][1] = "Consonant";
            } else {
                characterTable[i][1] = "Not a Letter";
            }
        }

        for (int i = 0; i < characterTable.length; i++) {
            System.out.printf(characterTable[i][0], characterTable[i][1]);
        }
        
        scanner.close();
    }
}