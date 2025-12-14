package Questions;
abstract class Test{
    abstract void show();
    void display(){
        System.out.println("Concrete method");
    }
}
class Demo extends Test{
    @Override
    void show() {
        System.out.println("Abstract method implemented");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.display();
    }
}

