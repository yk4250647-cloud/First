import java.util.Scanner;
public class Problem09_DiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter Discount Percentage: ");
        double discountPercent = input.nextDouble();
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        input.close();
    }
}