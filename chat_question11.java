import java.util.Scanner;
class chat_question11{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number to print the multiplication table of : ");
        int val=scan.nextInt();
        System.out.print("Enter number upto where you want to print the multiplication table : ");
        int mult=scan.nextInt();
        System.out.println("\nMultiplication table of "+val+" upto "+mult+" : ");
        for (int i=0;i<mult;i++){
            System.out.println(val+" X "+(i+1)+" = "+(val*(i+1)));
        }
    }
}