import java.util.Scanner;
class problem5{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        final double pi=3.14;
        System.out.print("Enter the radius of your cylinder (cm) : ");
        double radius=input.nextDouble();
        System.out.print("Enter the height of your cylinder (cm) : ");
        double height=input.nextDouble();
        System.out.println("\nRadius of your cylinder = "+radius+" cm");
        System.out.println("\nHeight of your cylinder = "+height+" cm");
        double volume=pi*radius*radius*height;
        System.out.println("\nVolume of your cylinder = "+volume+" cm^2");
    }
}