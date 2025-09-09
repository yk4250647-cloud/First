import java.util.Scanner;
class chat_question9{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter an alphabet : ");
        char alph=scan.next().charAt(0);
        switch (alph){
            case 'a':
                System.out.println("\n"+alph+" is a vowel.");
                break;
            case 'e':
                System.out.println("\n"+alph+" is a vowel.");
                break;
            case 'i':
                System.out.println("\n"+alph+" is a vowel.");
                break;
            case 'o':
                System.out.println("\n"+alph+" is a vowel.");
                break;
            case 'u':
                System.out.println("\n"+alph+" is a vowel.");
                break;
            case 'A':
                System.out.println("\n"+alph+" is a vowel.");
                break;
            case 'E':
                System.out.println("\n"+alph+" is a vowel.");
                break;
            case 'I':
                System.out.println("\n"+alph+" is a vowel.");
                break;
            case 'O':
                System.out.println("\n"+alph+" is a vowel.");
                break;
            case 'U':
                System.out.println("\n"+alph+" is a vowel.");
                break;
            default :
                System.out.println("\n"+alph+" is a consonant.");
        }

    }
}