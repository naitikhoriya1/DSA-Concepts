import java.util.Scanner;

public class numberPrint {
    public static void print(int n) {
        if (n==1) {
            System.out.println(1);
            return;
        }
        System.out.println(n +" ");
        print(n - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number ");
            int n = sc.nextInt();
            print(n);
        }
    }
}
