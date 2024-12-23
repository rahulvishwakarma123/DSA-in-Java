public class Polymorphism {
    
}


class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

class PolymorphismDemo {
    public void makeSound(Animal animal) {
        animal.sound();
    }

    // Method overloading
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        PolymorphismDemo demo = new PolymorphismDemo();
        demo.makeSound(myDog); // Dog barks
        demo.makeSound(myCat); // Cat meows

        // Method overloading
        System.out.println(demo.add(5, 3)); // 8
        System.out.println(demo.add(5.5, 3.3)); // 8.8
    }
}