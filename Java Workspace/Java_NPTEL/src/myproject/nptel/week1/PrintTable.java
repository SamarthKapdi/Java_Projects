package myproject.nptel.week1;
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
 // Print the multiplication table up to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

in.close();
    }
}