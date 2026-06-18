import java.util.Scanner;

public class Program8_ArrayIndexDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many names do you want to enter? ");
        int size = scanner.nextInt();
        String[] names = new String[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1);
            names[i] = scanner.next();
        }
        
        try {
           
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( e);
        } catch (RuntimeException e) {
            System.out.println( e);
        }
        
        System.out.println(names[names.length]); 
        
        scanner.close();
    }
}
