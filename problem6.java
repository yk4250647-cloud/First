import java.util.Scanner;
class problem6{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the principal amount (Rs.) : ");
        float prnc=input.nextFloat();
        System.out.print("Enter the interest rate (per year) : ");
        float intr=input.nextFloat();
        System.out.print("Enter the time (years) : ");
        float time=input.nextFloat();
        float simpleInterest=(prnc*intr*time)/100;
        System.out.println("\nThe total interest rate = "+simpleInterest+" Rs. per year");

    }
}