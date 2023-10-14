public class question3 {

    public static void change(int[][] mat) {
        System.out.println("Print matrix is : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // write your code here
        int row = 2, col = 3;
        int mat[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        change(mat);
        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = mat[i][j];
            }
        }
        change(transpose);
    }
}
