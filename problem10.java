import java.util.Scanner;
class problem10{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("\nEnter distance in kilometers : ");
    double kilom=scan.nextDouble();
    double mile=kilom* 0.621371;
    System.out.println("\nKilometers to Miles conversion :\n\n");
    System.out.println(kilom+" kilometers = "+mile+" miles");
    }
}