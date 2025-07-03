package com.rays.java.oop.encapsulation;

import java.util.Scanner;

public class TestDoctor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input for Heart Specialist
        System.out.println("Enter Heart Specialist details:");
        HeartSpecialist heart = new HeartSpecialist();
        System.out.print("Name: ");
        heart.setName(sc.nextLine());
        System.out.print("Degree: ");
        heart.setDegree(sc.nextLine());
        System.out.print("Experience (in years): ");
        heart.setExperience(sc.nextInt());
       
       

        // Input for ENT Specialist
        System.out.println("Enter ENT Specialist details:");
        ENTSpecialist ent = new ENTSpecialist();
        System.out.print("Name: ");
        ent.setName(sc.nextLine());
        System.out.print("Degree: ");
        ent.setDegree(sc.nextLine());
        System.out.print("Experience (in years): ");
        ent.setExperience(sc.nextInt());
        sc.nextLine(); 
      

        // Input for Neurologist
        System.out.println("Enter Neurologist details:");
        Neurologist neuro = new Neurologist();
        System.out.print("Name: ");
        neuro.setName(sc.nextLine());
        System.out.print("Degree: ");
        neuro.setDegree(sc.nextLine());
        System.out.print("Experience (in years): ");
        neuro.setExperience(sc.nextInt());
        

        // Output
        System.out.println("--- Doctor Information ---");

        System.out.println("Heart Specialist:");
        System.out.println("Name: " + heart.getName());
        System.out.println("Degree: " + heart.getDegree());
        System.out.println("Experience: " + heart.getExperience() + " years");
        
        heart.treatHeartPatient();

        System.out.println("ENT Specialist:");
        System.out.println("Name: " + ent.getName());
        System.out.println("Degree: " + ent.getDegree());
        System.out.println("Experience: " + ent.getExperience() + " years");
       
        ent.treatENTPatient();

        System.out.println("Neurologist:");
        System.out.println("Name: " + neuro.getName());
        System.out.println("Degree: " + neuro.getDegree());
        System.out.println("Experience: " + neuro.getExperience() + " years");
        
        neuro.treatBrainPatient();

        sc.close();
    }
}
