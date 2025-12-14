package Questions;
abstract class Shape{
    abstract double area();
}
class Circle extends Shape{
   double radius;
   Circle(double r){
       radius = r;
   }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{
    double length, width;
    Rectangle(double l, double w){
        length = l;
        width = w;
    }

    @Override
    double area() {
        return length * width;
    }
}
public class Area {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 5);
        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
