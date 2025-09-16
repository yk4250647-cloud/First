import java.util.Scanner;

class item{
  String itemCode;
  String itemName;
  double price;
  int quantity=0;
  void display(){
    System.out.println("\n\nItem details :\n");
    System.out.print("\nItem item name : "+itemName);
    System.out.print("\nItem code : "+itemCode);
    System.out.print("\nItem price : Rs. "+price);
    System.out.print("\nItem quantity : "+quantity);
    System.out.print("\nTotal item price : Rs. "+(price*quantity)+"\n");
  }
}

public class itemRecords{
  public static void main(String[] args) {
      Scanner inpt=new Scanner(System.in);
      while (1>0){
        item item=new item();
        System.out.println("\n\nEnter item details : ");
        System.out.print("\nEnter item item name : ");
        item.itemName=inpt.next();
        System.out.print("Enter item item code : ");
        item.itemCode=inpt.next();
        System.out.print("Enter item price : ");
        item.price=inpt.nextDouble();
        System.out.print("Enter item quantity : ");
        item.quantity=inpt.nextInt();

        item.display();

        System.out.print("\n\nenter 1 to continue : ");
        int cont=inpt.nextInt();
        if (cont!=1){break;}
      }
  }
}