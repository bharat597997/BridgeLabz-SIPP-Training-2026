import java.util.*;
public class Program4_DynamicDigitArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        number = Math.abs(number);
        
        int maxDigit = 10;
        int[] digitsArray = new int[maxDigit];
        
        int index = 0;
        long tempNumber = number; 
        
        if (tempNumber == 0) {
            digitsArray[0] = 0;
            index = 1;
        } else {
            while (tempNumber != 0) {
                int lastDigit = (int) (tempNumber % 10);
                digitsArray[index] = lastDigit;
                index++;
                
                if (index == maxDigit) {
                    maxDigit = maxDigit + 10;
                    int[] tempArray = new int[maxDigit];
                    for (int i = 0; i < digitsArray.length; i++) {
                        tempArray[i] = digitsArray[i];
                    }
                    digitsArray = tempArray;
                }
                
                tempNumber = tempNumber / 10;
            }
        }
        
        int largest = 0;
        int secondLargest = 0;
        
        for (int i = 0; i < index; i++) {
            int currentDigit = digitsArray[i];
            
            if (currentDigit > largest) {
                secondLargest = largest;
                largest = currentDigit;
            } else if (currentDigit > secondLargest && currentDigit != largest) {
                secondLargest = currentDigit;
            }
        }
        
        System.out.println("--- Results ---");
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        
        scanner.close();
    }
}