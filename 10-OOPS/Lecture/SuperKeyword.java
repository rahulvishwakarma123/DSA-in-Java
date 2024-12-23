class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound(); // calls the method in the superclass (Animal)
        System.out.println("Dog barks");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}