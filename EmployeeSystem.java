class Employee {
 	private static String companyName = "Tech Corp"; 
 	private static int totalEmployees = 0; 
 	private final int id; 
 	private String name;
 	private String designation;

 	public Employee(int id, String name, String designation) {
     	this.id = id;
     	this.name = name;
     	this.designation = designation;
     	totalEmployees++;
 	}

 	public void displayEmployeeDetails() {
     	if (this instanceof Employee) { 
			System.out.println("Employee details :\n");
         	System.out.println("Company : " + companyName);
         	System.out.println("ID : " + id);
         	System.out.println("Name : " + name);
         	System.out.println("Designation : " + designation);
     	}
 	}

 	public static void displayTotalEmployees() {
     	System.out.println("Total Employees : " + totalEmployees);
 	}
 }

 
 public class EmployeeSystem {
 	public static void main(String[] args) {
     	Employee emp1 = new Employee(1, "Suman", "Graphic designer");
     	Employee emp2 = new Employee(2, "Manish", "Software engineer");

     	emp1.displayEmployeeDetails();
     	emp2.displayEmployeeDetails();
         Employee.displayTotalEmployees();
 	}
 }