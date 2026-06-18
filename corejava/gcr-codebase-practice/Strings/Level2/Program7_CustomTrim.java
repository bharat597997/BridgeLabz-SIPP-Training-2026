import java.util.Scanner;

public class Program7_CustomTrim{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        String s1 = "";
        for (int i = start; i <= end; i++) {
            s1 += text.charAt(i);
        }
        String s2 = text.trim();
        System.out.println("Custom : " + s1);
        System.out.println("BuiltIn: " + s2);
        System.out.println(s1.equals(s2));
        
        sc.close();
    }
}