public class pow {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int num = power(x, n - 1);
        // int xn = x * num;
        // return xn;
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}