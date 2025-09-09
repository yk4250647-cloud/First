import java.util.Scanner;
class problem7{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the length of your rectangle (cm) : ");
    float length=scan.nextFloat();
    System.out.print("Enter the breadth of your rectangle (cm) : ");
    float breadth=scan.nextFloat();
    float perimeter=2*(length+breadth);
    System.out.println("\n\nThe perimeter of your rectangle = "+perimeter+" cm^2");
    }
}