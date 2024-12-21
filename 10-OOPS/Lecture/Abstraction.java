public class Abstraction {
    public static void main(String[] args) {
        
    }

}

// Parent class
abstract class Animal {

    String color = "brown";
    // constructor
    Animal(){
        System.out.println("Animal constructor called.");        
    }
    
    void eats(){
        System.out.println("Animal eats.");        
    }

    abstract void walk();
}

//child class
class Horse extends Animal{
    // constructor
    Horse(){
        System.out.println("Horse constructor called.");
    }

    void changeColor(){
        color = "Dark Brown";
    }

    void walk(){
        System.out.println("Sprints by 4 legs.");
    }
}

// Horse child class
class Mustang extends Horse{
    
    // constructor
    Mustang (){
        System.out.println("Mustang constructor called.");        
    }

}
