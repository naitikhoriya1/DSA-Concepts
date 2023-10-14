import java.util.Scanner;

public class palinddrom {
    public static boolean isPalindrom(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string");
            String name = sc.nextLine();
            System.out.println(isPalindrom(name));
        }
    }
}
