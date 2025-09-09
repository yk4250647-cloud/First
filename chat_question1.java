import java.util.Scanner;
class chat_question1{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter yout name : ");
        String name=scan.next();
        System.out.print("Enter yout age : ");
        int age=scan.nextInt();
        if (age==1){
            System.out.println("\n\nHello, "+name+"\nyou are "+age+" year old.");
        }
        else {
        System.out.println("\n\nHello, "+name+"\nyou are "+age+" years old.");
        }
    }
}