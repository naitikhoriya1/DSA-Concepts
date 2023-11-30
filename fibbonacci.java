public class fibbonacci {
    public static int fibb(int n ){
        if (n == 0) return 0;
        else if (n==1) return 1;
        return fibb(n-1) + fibb(n-2);
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibb(n));
    }
}
