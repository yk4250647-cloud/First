import java.util.Scanner;
class chat_question10{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=scan.nextInt();
        String div=num%3==0&&num%5==0?" divisible ":" not divisible ";
        System.out.println("\n\n"+num+" is "+div+" by both 3 and 5.");
    }
}