import java.util.Scanner;
class circle{
    double radius=0;
    final double pi=3.14;
    double area=0;
    double circm=0;
    void calcArea(){
         area=pi*radius*radius;
    }
    void calcCircm(){
         circm=2*pi*radius;
    }
    void display(){
        System.out.println("\n\nRadius of the circle : "+radius+" cm");
        System.out.println("\nArea of the circle : "+area+" cm^2");
        System.out.println("\nCircumference of the circle : "+circm+" cm");
    }
}
public class dimensionsOfCircle{
   public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    while (1>0){
        circle obj=new circle();
        System.out.print("\n\nEnter radius of the circle : ");
        obj.radius=scan.nextInt();
        obj.calcArea();
        obj.calcCircm();
        obj.display();
        System.out.print("\n\nenter 1 to continue : ");
        int cont=scan.nextInt();
        if (cont!=1){break;}
      }
        
   }
}