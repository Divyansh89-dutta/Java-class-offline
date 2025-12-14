class Demo {
    {
        System.out.println("Instance Initializer Block");
    }
    Demo(){
        System.out.println("Constructor");
    }
}

public class InitializerBlock {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}
