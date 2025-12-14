class MathUtil{
    static int square(int x){
        return x * x;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        System.out.println(MathUtil.square(5));
    }
}
