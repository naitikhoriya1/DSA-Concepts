public class power_function {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 0) {
                return pow(x, n / 2) * pow(x, n / 2);
            } else {
                return x * pow(x, n - 1);
            }
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int power = pow(x, n);
        System.out.println("The value of " + x + "^" + n + " is: " + power);
    }
}
