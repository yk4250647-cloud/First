import java.util.Scanner;
class chat_question8{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=scan.nextInt();
        if (num==0){
            System.out.print("\nYour number is zero.");
        }
        else if (num>0) {
            System.out.print("\n"+num+" is a positive number.");
        }
        else if (num<0) {
            System.out.print("\n"+num+" is a negative number.");
        }
    }
}