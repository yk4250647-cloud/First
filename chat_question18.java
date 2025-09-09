import java.util.Scanner;
class chat_question18{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter any string : ");
        String sentence=scan.nextLine();
        int size=sentence.length();
        for (int i=0;i<size;i++){
            if (sentence.charAt(i)==' '){
                System.out.println("Sorry, space breaking.");
                break;
            }
            else {
                System.out.println((i+1)+" : "+sentence.charAt(i));
            }
        }
    }
}