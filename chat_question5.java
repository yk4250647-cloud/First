import java.util.Scanner;
class chat_question5{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=scan.nextInt();
        System.out.print("\n"+num+"^ 2 = "+(num*num));
        System.out.print("\n"+num+"^ 3 = "+(num*num*num));
    }
}