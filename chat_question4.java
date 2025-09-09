import java.util.Scanner;
class chat_question4{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=scan.nextInt();
        System.out.print("Enter second number : ");
        int num2=scan.nextInt();
        if (num1>num2){
            System.out.println("\n"+num1+" is greater than "+num2+".");
        }
        else if (num2>num1){
            System.out.println("\n"+num2+" is greater than "+num1+".");
        }
        else {
           System.out.println("\n"+num2+" and "+num1+" are equal values."); 
        }
    }
}