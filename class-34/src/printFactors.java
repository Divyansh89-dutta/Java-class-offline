class Factors{
    static void printFactors(int n){
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0){
                System.out.print(i + " ");
                if (i != n/i)
                    System.out.print((n / i) + " ");
            }
        }
        System.out.println();
    }
}
public class printFactors {
    public static void main(String[] args) {
        int n = 100;
        Factors.printFactors(n);
    }
}
