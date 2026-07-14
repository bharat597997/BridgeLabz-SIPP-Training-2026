import java.util.Scanner;

public class BubbleSortProductPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (prices[j] > prices[j + 1]) {
                    int temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                }
            }
        }

        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(prices[i]);
            if (i != n - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}