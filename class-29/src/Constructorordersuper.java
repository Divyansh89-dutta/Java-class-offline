class Parent{
    Parent(){
        System.out.println("Parent()");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child()");
    }
}
public class Constructorordersuper {
    public static void main(String[] args) {
        new Child();
    }
}
