package com.rays.java.oop.encapsulation;

import java.util.Scanner;

public class TestAutomobile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Automobile car = new Automobile();

     
        System.out.print("Enter car color: ");
        String color = sc.nextLine();
        car.setColor(color);

        
        System.out.print("Enter car make: ");
        String make = sc.nextLine();
        car.setMake(make);

       
        System.out.print("Enter gear (1 to 5): ");
        int gear = sc.nextInt();
        car.changeGear(gear);
        System.out.println("Speed after changing gear: " + car.getSpeed());

        
        System.out.print("Enter speed to accelerate: ");
        int acc = sc.nextInt();
        car.accelerator(acc);
        System.out.println("Speed after accelerating: " + car.getSpeed());

       
        System.out.print("Enter brake power: ");
        int brake = sc.nextInt();
        car.brake(brake);
        System.out.println("Speed after braking: " + car.getSpeed());

        
        System.out.println("--- Final Car Info ---");
        System.out.println("Color: " + car.getColor());
        System.out.println("Make: " + car.getMake());
        System.out.println("Current Speed: " + car.getSpeed());

        sc.close();
    }
}
