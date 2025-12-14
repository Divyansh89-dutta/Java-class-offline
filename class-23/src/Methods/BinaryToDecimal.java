package Methods;

public class BinaryToDecimal {
    public String decimalToBinary(int n) {
        if (n == 0) return "0";
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binary.append(remainder);
            n = n / 2;
        }
        binary.reverse();
        return binary.toString();
    }
}
