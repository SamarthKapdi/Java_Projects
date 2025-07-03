package myproject.nptel.week1;
import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();
// Calculate the volume of the cylinder
        double volume = Math.PI * Math.pow(radius, 2) * height;

        
// Display the result
    System.out.printf("Volume is: %.2f", volume);
    in.close();
  }
}