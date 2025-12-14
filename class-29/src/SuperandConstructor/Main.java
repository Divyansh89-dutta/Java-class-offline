package SuperandConstructor;
class A{
    A(){
        System.out.println("A - Default Constructor");
    }
    A(int x){
        System.out.println("A - Parameterized Constructor: " + x);
    }
}
class B extends A{
    B(){
        System.out.println("B - Default Constructor");
    }
    B(int y){
        super(y);// calling parent parameterized constructor
        System.out.println("B - Parameterized Constructor: " + y);
    }
}
public class Main {
    public static void main(String[] args) {
        new B();
        System.out.println("------");
        new B(50);
    }
}
