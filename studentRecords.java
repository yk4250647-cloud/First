import java.util.Scanner;
class student{
    String name;
    String rollNumber;
    Double marks;
    String grade;
    void calcGrade(double mrks){
        if (mrks>=90){grade="A+";}
        else if (mrks<90&&mrks>=80){grade="A";}
        else if (mrks<80&&mrks>=75){grade="B+";}
        else if (mrks<75&&mrks>=65){grade="B";}
        else if (mrks<65&&mrks>=55){grade="C+";}
        else if (mrks<55&&mrks>=50){grade="C";}
        else if (mrks<60&&mrks>=45){grade="C-";}
        else if (mrks<45){grade="F";}
    }
    void display(){
        System.out.println("Student details :\n\n");
    System.out.print("\nStudent name : "+name);
    System.out.print("\nStudent roll number : "+rollNumber);
    System.out.print("\nStudent grade : "+grade+"\n");
    }
}
public class studentRecords{
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (1>0){
        student stud=new student();
        System.out.println("\n\nEnter student details : ");
        System.out.print("\nEnter student name : ");
        stud.name=scan.next();
        System.out.print("Enter student roll number : ");
        stud.rollNumber=scan.next();
        System.out.print("Enter student marks : ");
        stud.marks=scan.nextDouble();
        stud.calcGrade(stud.marks);
        stud.display();

        System.out.print("\n\nenter 1 to continue : ");
        int cont=scan.nextInt();
        if (cont!=1){break;}
      }
    }
}