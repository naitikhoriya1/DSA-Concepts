public class first_Accurance {
    public static void main(String[] args) {
        int num[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3, 6 };
        int key = 5;
        int milgya = 0;
        for (int i = 0; i < num.length; i++) {
            if (key == num[i]) {
                milgya = i;
                break;
            }
        }
        System.err.print(milgya);
    }
}