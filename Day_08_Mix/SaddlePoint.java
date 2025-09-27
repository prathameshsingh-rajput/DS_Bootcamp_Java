import java.util.ArrayList;

public class SaddlePoint {
    static boolean isSaddle(int[][] matrix, int row, int col, int key) {
        int curMax = Integer.MIN_VALUE;
        int curMin = Integer.MAX_VALUE;

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][col] > curMax) {
                curMax = matrix[i][col];
            }
        }

        for (int i = 0; i < cols; i++) {
            if (matrix[row][i] < curMin) {
                curMin = matrix[row][i];
            }
        }

        if (key == curMax && key == curMin)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int nat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        ArrayList<Integer> saddles = new ArrayList<>();

        for (int i = 0; i < nat.length; i++) {
            for (int j = 0; j < nat[0].length; j++) {
                if (isSaddle(nat, i, j, nat[i][j])) {
                    saddles.add(nat[i][j]);
                }
            }
        }
        System.out.println(saddles);
    }
}

