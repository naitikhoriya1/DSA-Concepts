public class Tilling_function {

    public static int tiling(int n) { // 2 * n
        // base case
        if (n == 1 || n == 0) {
            return 1;
        }
        // // vertical Choice
        // int fnm1 = tiling(n - 1);

        // // horizontal Choice
        // int fnm2 = tiling(n - 2);

        // int totalWays = fnm1 + fnm2;
        // return totalWays;
        return tiling(n - 1) + tiling(n - 2);
    }

    public static void main(String[] args) {
        System.out.print(tiling(4));
        System.out.println(" Ways ");
    }
}
