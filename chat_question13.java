import java.util.Scanner;
class chat_question13{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number : ");
        int val=scan.nextInt();
        int div=val;
        int fact=1;
        do 
        {
            fact*=div;
            div-=1;
        }
        while(div>1);
        System.out.println("\n\n!"+val+" = "+fact);
    }
}