public class discount_fee {
    public static void main(String[] args) {
    int fee = 125000;
        int discountpercentage = 10;
        int discount = (fee * discountpercentage) / 100;
        int discountedFee = fee - discount;
        System.out.println(
                "the discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);

    
}
}
