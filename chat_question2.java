import java.util.Scanner;
class chat_question2{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter first number : ");
    int num1=scan.nextInt();
    System.out.print("Enter second number : ");
    int num2=scan.nextInt();
    System.out.println("\nAddition :\n\n"+num1+" + "+num2+" = "+(num1+num2));
    System.out.println("\nSubtraction :\n\n"+num1+" - "+num2+" = "+(num1-num2));
    System.out.println("\nMultiplication :\n\n"+num1+" * "+num2+" = "+(num1*num2));
    System.out.println("\nDivision for quotient :\n\n"+num1+" / "+num2+" = "+(num1/num2));
  }
}