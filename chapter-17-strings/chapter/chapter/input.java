import java.util.Scanner;

public class input {

    public static void printLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print((str.charAt(i)-32 )+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = "naitik khoriya";
            printLetter(name);
        }
    }
}
