import java.util.Scanner;
class chat_question6{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enyter first number : ");
        int num1=input.nextInt();
        System.out.print("Enyter second number : ");
        int num2=input.nextInt();
        System.out.print("Enyter third number : ");
        int num3=input.nextInt();
        
        if (num1==num2&&num2==num3){
            System.out.println("\n\nAll 3 values are the same.");
        }
        else if (num1>num2&&num2>num3){
            System.out.println("\n\n"+num1+" is the greatest of all 3 values.");
        }
        else if (num2>num1&&num1>num3){
            System.out.println("\n\n"+num2+" is the greatest of all 3 values.");
        }
        else if (num3>num2&&num2>num1){
            System.out.println("\n\n"+num3+" is the greatest of all 3 values.");
        }


    }
}