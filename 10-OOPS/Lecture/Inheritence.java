public class Inheritence {
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.swims();
        Shark.eat();
    }
}
// baseClass / Parent class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats.");        
    }
    void breath(){
        System.out.println("Breaths.");        
    }

}

//subclass / ChildClass
class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("Swims under the water.");            
    }
}