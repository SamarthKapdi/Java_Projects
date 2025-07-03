package myproject.nptel.week2;
import java.util.*;
public class ConstructorOverloading {
    String name;
    int age;
    String grade;

    public ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ConstructorOverloading(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if(!grade.isEmpty()||grade!=null) System.out.print("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        String grade= null;

        // Check if grade is provided or not
        if(sc.hasNextLine())
        {
         sc.nextLine();
         grade =  sc.nextLine();
         }
        
        // Create the student object
        ConstructorOverloading student;
// Call the appropriate constructor based on input
        if (grade == null || grade.isEmpty()) {
            student = new ConstructorOverloading(name, age);  // Constructor when grade is not given
        } else {
            student = new ConstructorOverloading(name, age, grade);  // Constructor when grade is given
        }

        // Call the displayInfo method to display the student's information
        student.displayInfo();

sc.close();
    }
}
