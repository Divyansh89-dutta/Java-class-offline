package SuperandConstructor;
class One {
    One() {
        System.out.println("One");
    }
}
class Two extends One{
    Two(){
        super();
        System.out.println("Two");
    }
}
class Three extends Two{
    Three(){
        super();
        System.out.println("Three");
    }
}
public class Chaining {
    public static void main(String[] args) {
        new Three();
    }
}
