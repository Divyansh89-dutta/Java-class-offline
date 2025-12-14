package com.accessdemo.packageB;
import com.accessdemo.packageA.Parent;
public class Child extends Parent {
    public void testChildAccess(){
        publicMethod();       // ✔ accessible everywhere
        protectedMethod();    // ✔ accessible via inheritance
        // defaultMethod();   // ❌ NOT accessible (different package)
        // privateMethod();   // ❌ NOT accessible (private)

        testPrivateAccess();  // ✔ accessible (public)
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.testPrivateAccess();
        Parent p = new Parent();
        p.publicMethod();
        // p.protectedMethod(); // ❌ cannot access using object from another package
        // p.defaultMethod();   // ❌ not accessible
        // p.privateMethod();   // ❌ not accessible
    }
}
