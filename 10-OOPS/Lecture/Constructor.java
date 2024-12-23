/**
 * The Constructor class demonstrates the use of constructors in Java.
 * It creates instances of the Student class and copies data from one instance to another.
 * It also modifies the marks array of the first student and prints the updated marks.
 * 
 * Usage:
 * - Creates a Student object s1 and initializes its fields.
 * - Creates another Student object s2 by copying the data from s1.
 * - Modifies the marks array of s1 and prints the updated marks.
 * 
 * Note: The Student class should have a copy constructor to allow copying of data from one instance to another.
 */

public class Constructor {
    public static void main(String[] args) {
        // Create first student object and initialize fields
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.rollNo = 101;
        s1.studentId = 1;
        s1.marks[0] = 10;
        s1.marks[1] = 20;
        s1.marks[2] = 30;
        
        // Create second student object by copying data from s1
        Student s2 = new Student(s1);
        s2.studentId = 2; // Change studentId for s2
        
        // Modify marks array of s1
        s1.marks[0] = 40;
        
        // Print marks of s2 after copying data from s1
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollNo;
    int studentId;
    int marks[];

    // Default Constructor
    Student() {
        marks = new int[3];
        System.out.println("Constructor called...");
    }

    // Copy Constructor
    Student(Student s) {
        marks = new int[3];
        this.name = s.name;
        this.rollNo = s.rollNo;
        this.marks = s.marks; // Note: This creates a shallow copy of the marks array
    }
}