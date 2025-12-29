//public class Main {
//    public static void main(String[] args) {
//        int n = 100;
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            if (n%i == 0){
//                System.out.println(i);
//                if (i != n / i) {
//                    System.out.println(n / i);
//                };
//            }
//        }
//    }
//}
import java.util.*;


public class Main {
    static void printFactors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
        System.out.println();
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    static int countPrimes(int n) {
        if (n < 2) return 0;

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean p : prime) if (p) count++;
        return count;
    }

    static int kthFactor(int n, int k) {
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                small.add(i);
                if (i != n / i) large.add(n / i);
            }
        }

        Collections.reverse(large);
        small.addAll(large);

        return k <= small.size() ? small.get(k - 1) : -1;
    }

    static long power(long n, int p) {
        long res = 1;
        while (p > 0) {
            if ((p & 1) == 1) res *= n;
            n *= n;
            p >>= 1;
        }
        return res;
    }

    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 100;

        printFactors(n);
        System.out.println(isPrime(29));              // true
        System.out.println(countPrimes(50));          // 15
        System.out.println(kthFactor(100, 3));        // 4
        System.out.println(power(2, 10));             // 1024
        System.out.println(isPowerOfTwo(64));         // true
    }
}
