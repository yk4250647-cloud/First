import java.util.Scanner;
class problem8{
    //Math class is presnt in 'java.lang' library for mathematical methods like Math.pow(pow,base).
  //Note : This pnly works for 'int' or 'double' data-type.
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the base value : ");
        double base=scan.nextDouble();
        System.out.print("\n\nEnter the exponent value : ");
        double power=scan.nextDouble();
        double exponent=Math.pow(base,power);
        System.out.println("\n\nPower calculation :\n\n"+base+" ^ "+power+" = "+exponent);
        
    }
}