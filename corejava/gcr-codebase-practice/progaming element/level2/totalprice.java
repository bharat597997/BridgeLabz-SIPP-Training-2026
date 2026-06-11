import java.util.Scanner;

public class totalprice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the price of item: ");
        double unit_price = input.nextDouble();
        System.out.println("enter the quantity of item: ");
        int quantity = input.nextInt();
        double totalPrice = unit_price * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and the unit price is INR " + unit_price);
        input.close();
    }
    
}
