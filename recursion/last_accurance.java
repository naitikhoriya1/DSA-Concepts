public class last_accurance {
    public static void main(String[] args) {
        int num[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3, 5, 9, 3, 2, 4, 6 };
        int key = 5;
        int milgya = 0;
        for (int i = 0; i < num.length; i++) {
            if (key == num[i]) {
                milgya = i;
            }
        }
        System.err.print(milgya);
    }
}
