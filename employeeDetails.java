import java.util.Scanner;

class Employee{
  int id;
  String name;
  double salary;
  void display(){
    System.out.println("Employee details :\n\n");
    System.out.print("\nEmployee name : "+name);
    System.out.print("\nEmployee id : "+id);
    System.out.print("\nEmployee salary : Rs. "+salary+"\n");
  }
}

public class employeeDetails{
  public static void main(String[] args) {
      Scanner inpt=new Scanner(System.in);
      while (1>0){
        Employee emp=new Employee();
        System.out.println("\n\nEnter employee details : ");
        System.out.print("\nEnter employee name : ");
        emp.name=inpt.next();
        System.out.print("Enter employee id : ");
        emp.id=inpt.nextInt();
        System.out.print("Enter employee salary : ");
        emp.salary=inpt.nextDouble();

        emp.display();

        System.out.print("\n\nenter 1 to continue : ");
        int cont=inpt.nextInt();
        if (cont!=1){break;}
      }
  }
}