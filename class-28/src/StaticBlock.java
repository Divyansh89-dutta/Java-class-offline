class Test {
    static {
        System.out.println("Static block executed!");
    }
    Test() {
        System.out.println("Constructor called!");
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        Test t = new Test();
    }
}
