// Demonstrating Methods in Java
// Method Signature / Prototype / Definition
// Types: static, instance, factory method
class Demo{
    // --------------------------
    // METHOD SIGNATURE / PROTOTYPE / DEFINITION
    // --------------------------
    // Signature: returnType methodName(parameters)
    // Example: static void staticMethod()

    // --------------------------
    // STATIC METHOD
    // --------------------------
    // Declared with "static"
    // Can be invoked by using CLASS NAME (no object needed)
    static void staticMethod() {
        System.out.println("This is a static method, invoked by class name.");
    }
    // --------------------------
    // INSTANCE METHOD (Non-Static)
    // --------------------------
    // Declared without "static"
    // Must be invoked using OBJECT REFERENCE
    void instanceMethod(){
        System.out.println("This is an instance method, invoked by object reference.");
    }
    // --------------------------
    // FACTORY METHOD
    // --------------------------
    // A static method that RETURNS AN OBJECT of the class
    // Useful to control object creation
    static Demo createObject() {
        System.out.println("Factory method called → returning new object.");
        return new Demo();  // returns a new object of Demo class
    }
}
public class Main {
    public static void main(String[] args) {

        // --------------------------
        // INVOKING STATIC METHOD
        // --------------------------
        // No object required, call directly using CLASS NAME
        Demo.staticMethod();

        // --------------------------
        // USING FACTORY METHOD
        // --------------------------
        // Static factory method creates and returns a Demo object
        Demo obj1 = Demo.createObject();

        // --------------------------
        // INVOKING INSTANCE METHOD
        // --------------------------
        // Instance method needs object reference
        obj1.instanceMethod();
    }
}