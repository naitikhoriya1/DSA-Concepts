public class problem2 {
    public static void printCode(int n ){
        if (n == 1 ) {
            System.out.print(n + " ");
            return;
        }
        printCode(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printCode(n);
    }
}
