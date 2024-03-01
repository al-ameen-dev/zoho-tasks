package recursion1;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 1)
            return 1;
        if (n == 0)
            return 0;
        else
            return fibonacci(n - 2) + fibonacci(n - 1);
    }

}
