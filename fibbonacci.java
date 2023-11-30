public class fibbonacci {
    public static int fibb(int n ){
        if (n==0 || n==1) {
            return n;
        }
        return fibb(n-1) + fibb(n-2);
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibb(n));
    }
}
