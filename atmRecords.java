import java.util.Scanner;

class ATM{
  Scanner scan=new Scanner(System.in);
  long accountNumber;
  String accountHolder;
  double balance;
  void display(){
    System.out.println("Account details :\n\n");
    System.out.print("\nAccount holder name : "+accountHolder);
    System.out.print("\nAccount number : "+accountNumber);
    System.out.print("\nCurrent account balance : Rs. "+balance+"\n");
  }
  void deposit(){
    System.out.print("\nEnter amount to deposit in your account : ");
    double dep=scan.nextDouble();
    balance+=dep;
    System.out.println("\n\nYou have deposited Rs. "+dep+" in your bank account.");
    System.out.print("\nCurrent account balance : Rs. "+balance+"\n");
  }
  void withdraw(){
    System.out.print("\nEnter amount to withdraw from your account : ");
    double wthd=scan.nextDouble();
    if (balance>wthd){
      balance-=wthd;
    System.out.println("\n\nYou have withdrawn Rs. "+wthd+" from your bank account.");
    System.out.print("\nCurrent account balance : Rs. "+balance+"\n");
    }
    else {
      System.out.println("\n\nSorry, you don't have sufficient balance to withdraw this amount from.");
    }
    
  }
}

public class atmRecords{
  public static void main(String[] args) {
    
      Scanner inpt=new Scanner(System.in);
      while (1>0){
        ATM account=new ATM();
        System.out.println("\n\nEnter account details : ");
        System.out.print("\nEnter account accountHolder : ");
        account.accountHolder=inpt.next();
        System.out.print("Enter account number : ");
        account.accountNumber=inpt.nextLong();
        System.out.print("Enter account balance : ");
        account.balance=inpt.nextDouble();

        account.display();
        account.deposit();
        account.withdraw();
        account.display();

        System.out.print("\n\nenter 1 to continue : ");
        int cont=inpt.nextInt();
        if (cont!=1){break;}
      }
  }
}