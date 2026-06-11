import java.util.Scanner;

public class subtract_sum_and_product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;

        }
        int result = product - sum;
        System.out.println(result);
        input.close();
    }

}
