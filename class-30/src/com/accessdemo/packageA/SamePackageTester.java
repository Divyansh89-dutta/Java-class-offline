package com.accessdemo.packageA;

public class SamePackageTester {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.publicMethod();     // ✔ accessible
        p.protectedMethod();  // ✔ accessible (same package)
        p.defultMethod();    // ✔ accessible (same package)
        // p.privateMethod(); // ❌ NOT accessible (private)

        p.testPrivateAccess(); // ✔ allowed
    }
}
