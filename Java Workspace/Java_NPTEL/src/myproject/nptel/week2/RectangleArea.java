package myproject.nptel.week2;
import java.util.*;
public class RectangleArea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
// Define the class Rectangle here
        class Rectangle {
            int length, breadth;

            // Constructor using 'this' keyword
            Rectangle(int length, int breadth) {
                this.length = length;
                this.breadth = breadth;
            }

            // Method to calculate area
            int area() {
                return length * breadth; // Correct formula for area
            }
        }

  
// Create an object of Rectangle and call the area method
        Rectangle r = new Rectangle(length, breadth);
        System.out.print(r.area());

        sc.close();
    }
}