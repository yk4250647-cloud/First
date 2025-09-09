import java.util.Scanner;
class problem3{
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in); 
    System.out.print("\nEnter temperature in celsius : ");
    double cels=scan.nextDouble();
    double fahr=(cels*(9/5))+32;
    System.out.println("\nCelsius to Fahrenheit conversion :\n\n");
    System.out.println(cels+" degree C = "+fahr+" degree F");
    }
}