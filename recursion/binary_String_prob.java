public class binary_String_prob {

    public static void printString(int n, int lastPlace, String str) {

        // Base case: if the number is 0 then we have printed all digits
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printString(3, 0, "");
    }
}
