import java.util.Scanner;
class chat_question19{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number : ");
        int val=scan.nextInt();
        int div=val;
        int digit=0;
        while(div>0){
            digit*=10;
            digit+=(div%10);
            div/=10;
        }
        if (digit==val){
            System.out.println("\n\n"+val+" is a palindrome.");
        }
        else {
            System.out.println("\n\n"+val+" is not a palindrome.");
        }
    }
}