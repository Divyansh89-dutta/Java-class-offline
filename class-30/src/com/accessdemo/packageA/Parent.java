package com.accessdemo.packageA;

public class Parent {
    public void publicMethod(){
        System.out.println("Public method");
    }
    protected void protectedMethod(){
        System.out.println("Protected method");
    }
    void defultMethod(){
        System.out.println("Defult method");
    }
    private void privateMethod(){
        System.out.println("Private method");
    }
    public void testPrivateAccess() {
        // This works because private method is accessible inside the same class
        privateMethod();
    }
}
