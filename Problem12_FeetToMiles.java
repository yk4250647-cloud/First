import java.util.Scanner;
public class Problem12_FeetToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = feet / 5280;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
        input.close();
    }
}