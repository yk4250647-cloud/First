import java.util.Scanner;

class Book{
  String author;
  String title;
  double price;
  void display(){
    System.out.println("\n\nBook details :\n");
    System.out.print("\nBook title : "+title);
    System.out.print("\nBook id : "+author);
    System.out.print("\nBook price : Rs. "+price+"\n");
  }
}

public class bookDetails{
  public static void main(String[] args) {
      Scanner inpt=new Scanner(System.in);
      while (1>0){
        Book book=new Book();
        System.out.println("\n\nEnter Book details : ");
        System.out.print("\nEnter book title : ");
        book.title=inpt.next();
        System.out.print("Enter book author : ");
        book.author=inpt.next();
        System.out.print("Enter book price : ");
        book.price=inpt.nextDouble();

        book.display();

        System.out.print("\n\nenter 1 to continue : ");
        int cont=inpt.nextInt();
        if (cont!=1){break;}
      }
  }
}