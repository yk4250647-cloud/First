import java.util.Scanner;
class chat_question7{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter marks : ");
        int marks=scan.nextInt();
        System.out.print("\nYour grade : ");
        if (marks>=90){
            System.out.println("A");
        }
        else if (marks>=75&&marks<=89){
            System.out.println("B");
        }
        else if (marks>=50&&marks<=74){
            System.out.println("C");
        }
        else if (marks<50){
            System.out.println("Fail");
        }

    }
}