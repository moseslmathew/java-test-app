package Util.math;

public class calculus {

    public static int getFactorial(int n) {
        int fact=n;
        for (int i = 1; i < n; i++) {
            fact=fact*(n-i);
        }
        return fact;
    }
}
