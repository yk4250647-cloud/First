
import java.util.Scanner;
class chat_question20{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int list[]=new int[10];
        System.out.println("Enter values of your array :\n");
        int lrgst=0;
        int scnd_lrgst=0;
        for (int i=0;i<10;i++){
            System.out.print("\nValue "+(i+1)+" : ");
            list[i]=scan.nextInt();
            if (list[i]>lrgst){
                lrgst=list[i];
            }
        }
        for (int i=0;i<10;i++){
            if (list[i]==lrgst){
                continue;
            }
            else{
                if (list[i]>scnd_lrgst){
                scnd_lrgst=list[i];
            }
            }
            
        }
        System.out.println("Your array :\n");
        for (int i=0;i<10;i++){
            System.out.print("\nValue "+(i+1)+" : "+list[i]);
        }
        System.out.print("\n\nSecond largest element : "+scnd_lrgst);

    }
}