import java.util.Scanner;
public class dicountfees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     System.out.println("enter the fees" );
        int fees = input.nextInt();
        System.out.println("enter the discount percentage" );
        int discountpercentages = input.nextInt();
        int discounts = (fees * discountpercentages) / 100;
        int discountedFees = fees - discounts;
        System.out.println(
                "the discount amount is INR " + discounts + " and final discounted fee is INR " + discountedFees);
        input.close();

    
}
}
