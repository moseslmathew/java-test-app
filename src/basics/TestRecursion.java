package basics;

import java.util.Arrays;

public class TestRecursion {
    static int start = 0;
    static int current = 1;
    static int next = 0;

    public void calc(int n) {
        System.out.printf("Factorial of %d is : %d", n, factorial(n));
        System.out.println();
        System.out.printf("sum of first %d is : %d", n, sumOfFistN(n));
        System.out.println();

        int[] fibonacciArray=new int[n+1];
        fibo(n,fibonacciArray);
        System.out.println("Fibonacci Series"+ Arrays.toString(fibonacciArray));

    }

    public long factorial(long n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public int sumOfFistN(int n) {
        if (n == 0)
            return 0;
        return n + sumOfFistN(n - 1);
    }

    public void fibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(next);
            next = current + start;
            start = current;
            current = next;
        }
    }

    public void fibonacciRec(int n) {
        if (n > 0) {
            next = current + start;
            start = current;
            current = next;
            System.out.println(next);
            fibonacciRec(n - 1);
        }
    }

    public int fibo(int n, int[] fibArr) {
        if (n <2) {
            fibArr[n]=n;
            return n;
        }
        else{
            fibArr[n]=fibo(n - 1,fibArr) + fibo(n - 2,fibArr);
            return fibArr[n] ;
        }
    }

}
