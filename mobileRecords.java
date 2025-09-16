import java.util.Scanner;

class mobilePhone{
  static Scanner inpt=new Scanner(System.in);
  String brand;
  String model;
  double price;
  String colour="";
  void display(){
    System.out.println("\n\nMobile details :\n");
    System.out.print("\nMobile mobile model name : "+model);
    System.out.print("\nMobile brand : "+brand);
    System.out.print("\nMobile price : Rs. "+price);
  }
  void clr(){
    System.out.print("\n\nEnter mobile colour : ");
    colour=inpt.next();
    System.out.print("\nMobile colour : "+colour);
  }
}

public class mobileRecords{
  public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
      
      while (1>0){
        mobilePhone mobile=new mobilePhone();
        System.out.println("\n\nEnter mobile details : ");
        System.out.print("\nEnter mobile model name : ");
        mobile.model=scan.next();
        System.out.print("Enter mobile brand : ");
        mobile.brand=scan.next();
        System.out.print("Enter mobile price : ");
        mobile.price=scan.nextDouble();

        mobile.display();
        mobile.clr();

        System.out.print("\n\nenter 1 to continue : ");
        int cont=scan.nextInt();
        if (cont!=1){break;}
      }
  }
}