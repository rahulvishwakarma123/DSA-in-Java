// OOPS.java

// Class and Object
class Person {
    // Access Specifier
    private String name;
    private int age;

    // Encapsulation: Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method Overloading
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void display(String message) {
        System.out.println(message + " Name: " + name + ", Age: " + age);
    }
}

// Inheritance: Single Inheritance
class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age); // Super Keyword
        this.studentId = studentId;
    }

    // Method Overriding
    @Override
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentId);
    }
}

// Interface
interface Animal {
    void sound();
}

// Implementing Interface
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

// Static Keyword
class StaticExample {
    public static int staticCounter = 0;

    public StaticExample() {
        staticCounter++;
    }

    public static void displayCounter() {
        System.out.println("Static Counter: " + staticCounter);
    }
}

// Main Class
public class OOPS {
    public static void main(String[] args) {
        // Creating Objects
        Person person1 = new Person("Alice", 30);
        person1.display();

        Student student1 = new Student("Bob", 20, 12345);
        student1.display();

        Dog dog = new Dog();
        dog.sound();

        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample.displayCounter();
    }
}