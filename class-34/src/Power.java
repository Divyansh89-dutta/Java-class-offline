class solutionpower{
    static long power(long n, int p) {
        long res = 1;
        while (p > 0) {
            if (p % 2 == 1) res *= n;
            n *= n;
            p /= 2;
        }
        return res;
    }

}
public class Power {
}
