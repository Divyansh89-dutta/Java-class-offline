public class formal {
    public void abc(int a, int b) { // static method 'abc' that takes two integers
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        int a = 12, b = 23;
        formal obj = new formal();
        obj.abc(a, b); // ✅ Call the static method 'abc' with 'a' and 'b' as arguments
        //    Since 'abc' is static, we can call it directly — no object needed
    }
}