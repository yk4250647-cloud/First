
import java.util.Scanner;
class chat_question14{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int list[]=new int[5];
        System.out.println("Enter values of your array :\n");
        for (int i=0;i<5;i++){
            System.out.print("\nValue "+(i+1)+" : ");
            list[i]=scan.nextInt();
        }
        System.out.println("Your array :\n");
        for (int i=0;i<5;i++){
            System.out.print("\nValue "+(i+1)+" : "+list[i]);
        }
    }
}