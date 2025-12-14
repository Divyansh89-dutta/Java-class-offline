class A{
    int x = 10;
    void showA(){
        System.out.println("A.showA: x = " + x);
    }
}
class B extends A{
    int y = 20;
    void showB(){
        System.out.println("B.showB: y = " + y);
    }
}

public class singleinheritance {
    public static void main(String[] args) {
        B b = new B();
        b.showA();
        b.showB();
        System.out.println("Access inherited field x: " + b.x);
    }
}