import java.util.Scanner;
class problem9{
   public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter first number : ");
    double num1=scan.nextDouble();
    System.out.print("Enter second number : ");
    double num2=scan.nextDouble();
    System.out.print("Enter third number : ");
    double num3=scan.nextDouble();
    double average=(num1+num2+num3)/3;
    System.out.println("\n\nAverage of your 3 numbers = "+average);
   }
}