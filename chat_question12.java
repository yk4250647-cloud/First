import java.util.Scanner;
class chat_question12{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number : ");
        int val=scan.nextInt();
        int div=val;
        int sum=0;
        System.out.println("\n");
        while(div>0){
            sum+=(div%10);
            div/=10;
        }
        System.out.println("\n\nSum of all digits of "+val+" = "+sum);
    }
}