public class printFactorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int m = fact(n);
        System.out.print("factorial of " + n + " is " + m );
    }
}
