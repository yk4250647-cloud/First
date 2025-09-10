import java.util.Scanner;

public class MultiplicationTableRangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] table = new int[4];
        for (int i = 6; i <= 9; i++) {
            table[i - 6] = number * i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 6]);
        }
        sc.close();
    }
}
