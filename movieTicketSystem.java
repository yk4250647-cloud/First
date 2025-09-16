import java.util.Scanner;
class MovieTicket{
    Scanner input=new Scanner(System.in);
    String movieName="";
    String seatNumber="";
    double price=0;
    void show(){
        System.out.println("\n\nMovie ticket details :\n");
        System.out.println("Movie name : "+movieName);
        System.out.println("Seat number : "+seatNumber);
        System.out.println("Ticket price : Rs. "+price);
    }
    void bookTicket(){
       System.out.println("\n\nEnter ticket details :\n");
        System.out.print("Enter movie name : ");
        movieName=input.next();
        System.out.print("Enter seat number : ");
        seatNumber=input.next();
        System.out.print("Enter ticket price : ");
        price=input.nextDouble();

}
}
public class movieTicketSystem{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(1>0){
            MovieTicket ticket=new MovieTicket();
            ticket.bookTicket();
            ticket.show();
            System.out.print("\n\nenter 1 to continue : ");
        int cont=scan.nextInt();
        if (cont!=1){break;}
        }
        

    }
}