import java.util.Scanner;

class PalindromeChecker{
  String text;
  void check(){
    String rev="";
    for (int i=(text.length()-1);i>=0;i--){
        rev+=text.charAt(i);
    }
    if (text.equalsIgnoreCase(rev)){
      System.out.println("\n"+text+" is a palindrome.");
    }
    else {
      System.out.println("\n"+text+" is not a palindrome.");
    }
  }
}

public class checkPalindrome{
  public static void main(String[] args) {
      Scanner inpt=new Scanner(System.in);
      while (1>0){
        PalindromeChecker obj=new PalindromeChecker();
        System.out.print("\nEnter any string : ");
        obj.text=inpt.next();
        System.out.print("\nYour string : "+obj.text);
        obj.check();

        System.out.print("\nEnter 1 to continue : ");
        int cont=inpt.nextInt();
        if (cont!=1){break;}
      }
  }
}