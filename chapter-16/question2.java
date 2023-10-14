public class question2 {

    public static void main(String[] args) {
        int[][] nums = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };
        int add = 0;
        for (int i = 0; i < nums[0].length; i++) {
            add += nums[2][i];
        }
        System.out.println("Sum is : " + add);
    }
}
