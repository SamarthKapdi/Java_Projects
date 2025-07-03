package myproject.nptel.week1;
import java.util.Scanner;
public class QuotientAndRemainder{
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
// Compute quotient and remainder
        int quotient = x / y;
        int remainder = x % y;

        // Print the results exactly as required
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);


sc.close();
  }
}