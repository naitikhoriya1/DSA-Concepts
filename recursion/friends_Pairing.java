public class friends_Pairing {

    public static int pairing(int n) {

        // Base case
        if (n == 1 || n == 2) {
            return n;
        }
        // // Choice - Single
        // int fnm1 = pairing(n - 1);

        // // Choice - Couple
        // int fnm2 = pairing(n - 2);

        // // Pairs
        // int pairWays = (n - 1) * fnm2;

        // // TotalWays
        // int totWays = (n - 1) + pairWays;
        // return totWays;
        return pairing(n - 1) + (n - 1) * pairing(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(pairing(3));
    }
}
