package stepic;

public class GreatestCommonDivisor {
    private int gcdRecursive(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a >= b) {
            return gcdRecursive(a % b, b);
        } else {
            return gcdRecursive(a, b % a);
        }
    }

    private long gcd(long a, long b) {
        while (true) {
            if (a == 0) return b;
            if (b == 0) return a;
            if (a >= b) {
                // a, b <- a % b, b
                a %= b;
            } else {
                // a, b <- a, b % a
                b %= a;
            }
        }

    }
}
