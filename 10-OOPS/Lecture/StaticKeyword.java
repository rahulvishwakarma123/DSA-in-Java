public class StaticKeyword {

    // Static variable
    static int staticVariable = 10;

    // Instance variable
    int instanceVariable = 20;

    // Static method
    static void staticMethod() {
        System.out.println("Static method called.");
        // Can access static variables
        System.out.println("Static variable: " + staticVariable);
        // Cannot access instance variables
        // System.out.println("Instance variable: " + instanceVariable); // This will cause an error
    }

    // Instance method
    void instanceMethod() {
        System.out.println("Instance method called.");
        // Can access both static and instance variables
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Instance variable: " + instanceVariable);
    }

    public static void main(String[] args) {
        // Calling static method
        StaticKeyword.staticMethod();

        // Creating an instance of the class
        StaticKeyword obj = new StaticKeyword();

        // Calling instance method
        obj.instanceMethod();
    }
}