package myproject.nptel.week1;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
// Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
sc.close();
    }
}