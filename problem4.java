import java.util.Scanner;
class problem4{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        final double pi=3.14;
        System.out.print("Enter the radius of your circle (cm) : ");
        double radius=scan.nextDouble();
        System.out.println("\nRadius of your circle = "+radius+" cm");
        double area=pi*radius*radius;
        System.out.println("\nArea of your circle = "+area+" cm^2");

    }
}