public class Main {
    public static void main(java.lang.String[] args) {
        StringBuilder sb = new StringBuilder();
//        sb.append("Divyansh");
//        System.out.println(sb.capacity());
//        System.out.println(sb.length());
        for (char i = 0; i < 'z'; i++) {
            sb.append(i);
            System.out.print("capacity = " + sb.capacity());
            System.out.print("Length = " + sb.length());
        }
    }
}