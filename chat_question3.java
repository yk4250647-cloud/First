import java.util.Scanner;
class chat_question3{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=scan.nextInt();
        if (num%2==0){
            System.out.print("\n"+num+" is an even number.");
        }
        else {
            System.out.print("\n"+num+" is an odd number.");
        }
    }
}